package com.example.LeetCode.L49_GroupAnagrams;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.utils.Utils;

public class GroupAnagramsTest {

    @Test
    public void testGroupAnagrams() {
        GroupAnagrams g = new GroupAnagrams();
        assertTrue(Utils.Is2DListEqualTo2DArray(
                g.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" }),
                new String[][] { { "bat" }, { "nat", "tan" }, { "ate", "eat", "tea" } }));
    }
}
