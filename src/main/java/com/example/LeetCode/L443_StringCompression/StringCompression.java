package com.example.LeetCode.L443_StringCompression;

// https://leetcode.com/problems/string-compression/

public class StringCompression {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char curr = chars[i];
        while (i < chars.length) {
            System.out.println("i: " + i + " length: " + chars.length);
            sb.append(chars[i]);
            int count = 0;
            while (i < chars.length && chars[i] == curr) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(count);
            }
            if (i < chars.length) {
                curr = chars[i];
            }
            count = 0;
        }
        char[] tmp = sb.toString().toCharArray();
        for (int j = 0; j < tmp.length; j++) {
            chars[j] = tmp[j];
        }
        return tmp.length;
    }
}
