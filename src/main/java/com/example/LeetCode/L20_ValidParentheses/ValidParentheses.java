package com.example.LeetCode.L20_ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } else if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') {
                if (stack.size() == 0) {
                    return false;
                }
                char c = stack.pop();
                if (c == '(' && arr[i] != ')') {
                    return false;
                } else if (c == '[' && arr[i] != ']') {
                    return false;
                } else if (c == '{' && arr[i] != '}') {
                    return false;
                }
            }
        }
        return stack.size() == 0;
    }
}
