package com.example.LeetCode.L122_LongestConsecutiveSequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            set.add(num);
        }
        int max = 0;
        for (Integer s : set) {
            if (set.contains(s - 1)) {
                continue;
            }
            int tmp = 1;
            while (set.contains(s + tmp)) {
                tmp++;
            }
            max = Math.max(max, tmp);
        }

        return max;
    }
}
