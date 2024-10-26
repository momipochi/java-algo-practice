package com.example.LeetCode.L3_LongestSubstringWithoutRepeat;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstringWithoutRepeat {
    char[] c;
    int l = 0;
    int r = 0;

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        c = s.toCharArray();
        while (r < c.length) {
            int tmp = setNewLeft(c[r], l, r);
            if (tmp != 0) {
                l += tmp;
                r++;
            } else {
                r++;
            }
            tmp = r - l;
            max = max > tmp ? max : tmp;
        }
        return max;
    }

    private int setNewLeft(char cr, int start, int end) {
        int count = 1;
        for (int i = start; i < end; i++) {
            if (cr == c[i]) {
                return count;
            }
            count++;
        }
        return 0;
    }
}