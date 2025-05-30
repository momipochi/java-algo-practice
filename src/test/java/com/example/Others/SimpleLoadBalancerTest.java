package com.example.Others;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.junit.Before;
import org.junit.Test;

public class SimpleLoadBalancerTest {
    int coreCount;
    ExecutorService es;
    SimpleLoadBalancer slb;

    public List<Callable<Object>> generateRegisterCallables(int num) {
        List<Callable<Object>> todo = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            todo.add(Executors.callable(() -> {
                slb.register(UUID.randomUUID().toString());
            }));
        }
        return todo;
    }

    public List<Callable<Object>> generateDeregisterCallables(int num) {
        if (num > slb.getInstanceSize()) {
            num = slb.getInstanceSize();
        }
        List<Callable<Object>> todo = new ArrayList<>();
        String[] instances = new String[num];
        instances = slb.getInstances().toArray(instances);
        for (int i = 0; i < num; i++) {
            final String tmpI = instances[i];
            todo.add(Executors.callable(() -> {
                slb.deregister(tmpI);
            }));
        }
        return todo;
    }

    @Before
    public void Init() {
        coreCount = Runtime.getRuntime().availableProcessors();
        es = Executors.newFixedThreadPool(coreCount);
        slb = new SimpleLoadBalancer();
    }

    @Test
    public void testDeregister() throws InterruptedException {

        es.invokeAll(generateRegisterCallables(10));
        assertEquals(10, slb.getInstanceSize());

        es.invokeAll(generateDeregisterCallables(2));
        assertEquals(8, slb.getInstanceSize());
    }

    @Test
    public void testGetRandom() {

    }

    @Test
    public void testGetRoundRobin() {

    }

    @Test
    public void testRegister() throws InterruptedException {
        int registerCount = 10;
        es.invokeAll(generateRegisterCallables(registerCount));
        assertEquals(registerCount, slb.getInstanceSize());
        es.invokeAll(generateRegisterCallables(registerCount));
        assertEquals(registerCount, slb.getInstanceSize());
        assertFalse(slb.register(UUID.randomUUID().toString()));
    }
}
