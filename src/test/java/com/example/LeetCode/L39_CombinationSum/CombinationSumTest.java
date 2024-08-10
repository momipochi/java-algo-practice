package com.example.LeetCode.L39_CombinationSum;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CombinationSumTest {
    @Test
    public void testCombinationSum() {
        CombinationSum cs = new CombinationSum();
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(Arrays.asList(new Integer[] { 2, 2, 3 }));
        ans.add(Arrays.asList(new Integer[] { 7 }));
        int[] can = new int[] { 2, 3, 6, 7 };
        int target = 7;
        assertEquals(ans, cs.combinationSum(can, target));
    }
}
