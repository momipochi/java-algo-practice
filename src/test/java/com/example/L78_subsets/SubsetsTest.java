package com.example.L78_subsets;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.function.Function;

import org.junit.Before;
import org.junit.Test;

import com.example.utils.Utils;

public class SubsetsTest {
    private int[][] cases;
    private int[][][] ans;

    @Before
    public void init() {
        cases = new int[][] { { 1, 2, 3 }, { 0 }, { 1, 2, 2 } };
        ans = new int[][][] { { {}, { 1 }, { 2 }, { 1, 2 }, { 3 }, { 1, 3 }, { 2, 3 }, { 1, 2, 3 } }, { {}, { 0 } },
                { {}, { 1 }, { 1, 2 }, { 1, 2, 2 }, { 2 }, { 2, 2 } } };
    }

    @Test
    public void testSubsetsBacktrack() {
        assertTrue(testHandler(Subsets::subsetsBacktrack));
    }

    @Test
    public void testSubsetsBitmanipulation() {
        assertTrue(testHandler(Subsets::subsetsBitmanipulation));
    }

    @Test
    public void testSubsetsIterative() {
        assertTrue(testHandler(Subsets::subsetsIterative));
    }

    private boolean testHandler(Function<int[], List<List<Integer>>> callback) {
        for (int i = 0; i < cases.length; i++) {
            if (!Utils.Is2DListEqualTo2DArray(callback.apply(cases[i]), ans[i])) {
                return false;
            }
        }
        return true;
    }
}
