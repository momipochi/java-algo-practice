package com.example.LeetCode.L49_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] tmp = strs[i].toCharArray();
            Arrays.sort(tmp);
            String sorted = new String(tmp);
            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
