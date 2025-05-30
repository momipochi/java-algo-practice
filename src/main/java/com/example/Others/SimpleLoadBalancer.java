package com.example.Others;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class SimpleLoadBalancer {
    private static final int MAX_INSTANCES = 10;
    private final Set<String> instances = new HashSet<>(); // Ensures uniqueness
    private final List<String> instanceList = new ArrayList<>(); // For ordered access
    private final Random random = new Random();
    private final AtomicInteger roundRobinIndex = new AtomicInteger(0);

    // Register a new instance
    public synchronized boolean register(String address) {
        if (instances.size() >= MAX_INSTANCES || instances.contains(address)) {
            return false; // Reject duplicate or excess instances
        }
        instances.add(address);
        instanceList.add(address);
        return true;
    }

    // Random selection
    public synchronized String getRandom() {
        if (instanceList.isEmpty()) {
            throw new IllegalStateException("No instances registered.");
        }
        int index = random.nextInt(instanceList.size());
        return instanceList.get(index);
    }

    // Round-robin selection
    public synchronized String getRoundRobin() {
        if (instanceList.isEmpty()) {
            throw new IllegalStateException("No instances registered.");
        }
        int index = roundRobinIndex.getAndUpdate(i -> (i + 1) % instanceList.size());
        return instanceList.get(index);
    }

    // Deregister an instance
    public synchronized boolean deregister(String address) {
        if (instances.remove(address)) {
            instanceList.remove(address);
            return true;
        }
        return false;
    }

    public int getInstanceSize() {
        return instances.size();
    }

    public Set<String> getInstances() {
        return instances;
    }
}
