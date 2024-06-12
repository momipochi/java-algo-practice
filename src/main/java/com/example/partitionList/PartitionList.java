package com.example.partitionList;

import com.example.classes.ListNode;

// https://leetcode.com/problems/partition-list/description/
// Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

// You should preserve the original relative order of the nodes in each of the two partitions.
public class PartitionList {

    public static ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(), right = new ListNode(), leftHead = left, rightHead = right, tmp = head;
        while (tmp != null) {
            if (tmp.val < x) {
                left.next = tmp;
                left = left.next;
            } else {
                right.next = tmp;
                right = right.next;
            }
            tmp = tmp.next;
        }
        right.next = null;
        left.next = rightHead.next;
        return leftHead.next;
    }
}
