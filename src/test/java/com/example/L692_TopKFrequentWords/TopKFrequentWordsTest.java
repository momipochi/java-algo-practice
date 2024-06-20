package com.example.L692_TopKFrequentWords;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TopKFrequentWordsTest {
    @Test
    public void testTopKFrequent() {
        TopKFrequentWords topk = new TopKFrequentWords();
        String[] cs = new String[] { "i", "love", "leetcode", "i", "love", "coding" };
        String[] ans = new String[] { "i", "love" };
        int k = 2;
        assertArrayEquals(ans, topk.topKFrequentStream(cs, k).toArray(new String[] {}));
    }
}
