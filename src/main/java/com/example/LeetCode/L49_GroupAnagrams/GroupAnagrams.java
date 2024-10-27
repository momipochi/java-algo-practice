package com.example.LeetCode.L49_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String tmp = new String(c);
            map.putIfAbsent(tmp, new ArrayList<>());
            map.get(tmp).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
