package com.example.LeetCode.L13_RomanToInteger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(c[i]) < m.get(c[i + 1])) {
                ans -= m.get(c[i]);
            } else {
                ans += m.get(c[i]);
            }
        }

        return ans;
    }
}
