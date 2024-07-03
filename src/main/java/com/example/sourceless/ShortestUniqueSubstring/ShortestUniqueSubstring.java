package com.example.sourceless.ShortestUniqueSubstring;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ShortestUniqueSubstring {
    public int Solution(String S) {
        HashMap<String, Integer> res = new HashMap<>();
        operate(res, S);
        return Collections.min(res.entrySet(), new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                int res = o1.getValue().compareTo(o2.getValue());
                if (res == 0)
                    return o1.getKey().compareTo(o2.getKey());
                return res;
            }

        }).getKey().length();
    }

    public void operate(HashMap<String, Integer> res, String S) {
        for (int i = 0; i < S.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < S.length(); j++) {
                sb.append(S.charAt(j));
                res.put(sb.toString(), res.getOrDefault(sb.toString(), 0) + 1);
            }
        }
    }
}
