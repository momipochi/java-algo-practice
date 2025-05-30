package com.example.LeetCode.L1248_CountNumberOfNiceSubarrays;

public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int[] map = new int[nums.length + 1];
        map[0] = 1;
        int res = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i] & 1;
            if (count >= k) {
                res += map[count - k];
            }
            map[count]++;
        }
        return res;
    }
}
