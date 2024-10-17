package com.example.LeetCode.L443_StringCompression;

// https://leetcode.com/problems/string-compression/

public class StringCompression {
    public int compress(char[] chars) {
        int i = 0, size = 0, currI = 0;
        char curr = chars[i];
        while (i < chars.length) {
            chars[currI] = chars[i];
            currI++;
            size++;
            int count = 0;
            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }
            if (count > 1) {
                chars[currI] = (char) count;
                currI++;
                size++;
            }
            if (i < chars.length) {
                curr = chars[i];
            }
            count = 0;
        }
        return size;
    }
}
