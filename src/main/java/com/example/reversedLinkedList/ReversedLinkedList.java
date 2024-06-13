package com.example.reversedLinkedList;

import com.example.classes.ListNode;

public class ReversedLinkedList {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode res = new ListNode();
        res.next = head;
        ListNode prev = res;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;
        for (int i = left; i < right; i++) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return res.next;
    }
}

/*
 * 
 * prev.next = next.next
 * next.next = curr
 * curr.next = prev
 * 
 */