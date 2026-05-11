package com.example.LeetCode.L20_ValidParentheses;

// https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {
    public boolean isValid(String s) {
        int size = s.length();
        if (size % 2 != 0)
            return false;
        char[] arr = s.toCharArray();
        char[] stk = new char[size];
        int stkIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '(' || c == '[' || c == '{') {
                stk[stkIndex] = c;
                stkIndex++;
            } else {
                if (stkIndex == 0) {
                    return false;
                }
                stkIndex--;
                char cr = stk[stkIndex];
                if (cr == '(' && c != ')') {
                    return false;
                } else if (cr == '[' && c != ']') {
                    return false;
                } else if (cr == '{' && c != '}') {
                    return false;
                }
            }
        }
        return stkIndex == 0;
    }
}
