package com.example.LeetCode.L150_EvaluateReversePolishNotation;

import java.util.Map;
import java.util.Stack;
import java.util.function.BinaryOperator;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Map<String, BinaryOperator<Integer>> map = Map.of("*", (a, b) -> a * b, "/", (a, b) -> a / b, "+",
                (a, b) -> a + b, "-", (a, b) -> a - b);
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        while (index < tokens.length) {
            if (map.containsKey(tokens[index])) {
                int a = stack.pop(), b = stack.pop();
                stack.push(map.get(tokens[index]).apply(b, a));
            } else {
                stack.push(Integer.parseInt(tokens[index]));
            }
            index++;
        }
        return stack.pop();
    }

    private int idx;

    public int evalRPNFurtherOptimized(String[] tokens) {
        idx = tokens.length - 1;
        return eval(tokens);
    }

    private int eval(String[] tokens) {
        int num = 0;
        String e = tokens[idx > 0 ? idx-- : 0];
        if (e.equals("+")) {
            num = eval(tokens);
            return eval(tokens) + num;
        } else if (e.equals("-")) {
            num = eval(tokens);
            return eval(tokens) - num;
        } else if (e.equals("*")) {
            num = eval(tokens);
            return eval(tokens) * num;
        } else if (e.equals("/")) {
            num = eval(tokens);
            return eval(tokens) / num;
        } else {
            return Integer.parseInt(e);
        }
    }
}
