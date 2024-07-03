package com.example.LeetCode.L86_partitionList;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.classes.ListNode;
import com.example.utils.Utils;

public class PartitionListTest {
    @Test
    public void testPartition() {
        int[] vals = new int[] { 1, 4, 3, 2, 5, 2 };
        ListNode nodeCase = new ListNode(), head = nodeCase;
        for (int i = 0; i < vals.length; i++) {
            nodeCase.next = new ListNode(vals[i]);
            nodeCase = nodeCase.next;
        }
        assertTrue(Utils.IsSameListNode(PartitionList.partition(head.next, 3), head.next));
    }

}
