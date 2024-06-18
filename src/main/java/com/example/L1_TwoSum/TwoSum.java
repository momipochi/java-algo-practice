package com.example.L1_TwoSum;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = IntStream.range(0, nums.length).boxed()
                .collect(Collectors.toMap(i -> nums[i], i -> i));
        int[] res = new int[] { 0, 0 };
        for (int j = 0; j < nums.length; j++) {
            int tmp = target - nums[j];
            if (map.containsKey(tmp)) {
                res[0] = j;
                res[1] = map.get(tmp);
                break;
            }
        }
        return res;
    }
}
