package com.example.LeetCode.L387_FirstUniqueCharacter;

// https://leetcode.com/problems/first-unique-character-in-a-string/description/

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int[] al = new int[26];
        for (int i = 0; i < c.length; i++) {
            al[c[i] - 97]++;
        }
        for (int i = 0; i < c.length; i++) {
            if (al[c[i] - 97] == 1) {
                return i;
            }
        }
        return -1;
    }

}
