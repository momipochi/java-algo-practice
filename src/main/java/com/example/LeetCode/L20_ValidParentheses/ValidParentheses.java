package com.example.LeetCode.L20_ValidParentheses;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] strs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < strs.length; i++) {
            char c = strs[i];
            if (c == '[' || c == '(' || c == '{') {
                stack.push(c);
            } else {
                if (stack.size() == 0) {
                    return false;
                }
                char tmp = stack.pop();
                if (tmp == '[' && c != ']') {
                    return false;
                } else if (tmp == '{' && c != '}') {
                    return false;
                } else if (tmp == '(' && c != ')') {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
