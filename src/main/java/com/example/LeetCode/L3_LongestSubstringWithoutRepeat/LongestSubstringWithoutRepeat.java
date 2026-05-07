package com.example.LeetCode.L3_LongestSubstringWithoutRepeat;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWithoutRepeat {
    char[] strs;
    int max = 0;

    public int lengthOfLongestSubstring(String s) {
        strs = s.toCharArray();
        if (strs.length == 1)
            return 1;
        int left = 0, right = left + 1;

        while (strs.length > right) {
            left += nextIndex(strs[right], left, right);
            right++;
            int tmp = right - left;
            if (max < tmp)
                max = tmp;
        }
        return this.max;
    }

    public int nextIndex(char c, int start, int end) {
        int count = 1;
        for (int i = start; i < end; i++) {
            if (c == strs[i]) {
                return count;
            }
            count++;
        }
        return 0;
    }
}