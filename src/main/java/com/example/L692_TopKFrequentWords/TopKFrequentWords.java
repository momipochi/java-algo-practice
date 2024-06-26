package com.example.L692_TopKFrequentWords;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TopKFrequentWords {
    public List<String> topKFrequentStream(String[] words, int k) {
        Map<String, Integer> res = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            res.put(words[i], res.getOrDefault(words[i], 0) + 1);
        }

        return res.entrySet().stream().sorted((a, b) -> {
            int i = a.getValue().compareTo(b.getValue());
            if (i != 0) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        }).limit(k).map(x -> x.getKey()).toList();
    }

    public List<String> topKFrequentLinkedListOptimized(String[] words, int k) {
        Map<String, Integer> res = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            res.put(words[i], res.getOrDefault(words[i], 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>();

        for (Map.Entry<String, Integer> e : res.entrySet()) {
            list.add(e);
        }
        list.sort((a, b) -> {
            int i = a.getValue().compareTo(b.getValue());
            if (i != 0) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });
        List<String> ret = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            ret.add(list.get(i).getKey());
        }
        return ret;
    }

    private List<String> _topKeysLs = null;

    public List<String> topKFrequentAbstractListOptimized(String[] words, int k) {
        final Map<String, Integer> _freqMap = new HashMap<String, Integer>();
        final List<String> _keysLs = new ArrayList<String>();
        return new AbstractList<String>() {
            public String get(int index) {
                init();
                return _topKeysLs.get(index);
            }

            public int size() {
                init();
                return _topKeysLs.size();
            }

            protected void init() {
                if (_topKeysLs != null)
                    return;

                for (String w : words)
                    _freqMap.put(w, _freqMap.getOrDefault(w, 0) + 1);
                _keysLs.addAll(_freqMap.keySet());
                Comparator<String> comparator = (String a, String b) -> {
                    int freq1 = _freqMap.get(a), freq2 = _freqMap.get(b);

                    if (freq1 < freq2)
                        return 1;
                    else if (freq1 > freq2)
                        return -1;
                    else
                        return a.compareTo(b);
                };
                Collections.sort(_keysLs, comparator);
                _topKeysLs = _keysLs.subList(0, k);
            }
        };
    }
}
