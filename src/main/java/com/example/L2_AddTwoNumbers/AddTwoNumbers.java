package com.example.L2_AddTwoNumbers;

import com.example.classes.ListNode;

// https://leetcode.com/problems/add-two-numbers/description/
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp = new ListNode();
        ListNode res = tmp;
        int carry = 0;
        while (l1 != null || l2 != null) {
            tmp.next = new ListNode();
            tmp = tmp.next;
            if (l1 != null) {
                tmp.val += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                tmp.val += l2.val;
                l2 = l2.next;
            }
            tmp.val += carry;
            carry = tmp.val / 10;
            tmp.val = tmp.val % 10;

        }
        if (carry > 0) {
            tmp.next = new ListNode(carry);
        }
        return res.next;
    }
}
