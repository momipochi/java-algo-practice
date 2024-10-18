package com.example.LeetCode.L3_LongestSubstringWithoutRepeat;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = 0, max = 0;

        while (r < arr.length) {
            int offset = getOffset(arr, arr[r], l, r);
            if (offset != 0) {
                l += offset;
                r++;
            } else {
                r++;
            }
            offset = r - l;
            max = max < offset ? offset : max;
        }

        return max;
    }

    private int getOffset(char[] arr, char c, int l, int r) {
        int count = 1;
        for (int i = l; i < r; i++) {
            if (arr[i] == c) {
                return count;
            }
            count++;
        }
        return 0;
    }
}