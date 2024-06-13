package com.example.reversedLinkedList;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.classes.ListNode;
import com.example.utils.Utils;

public class ReversedLinkedListTest {
    public class TestCase {
        public ListNode head;
        public int left;
        public int right;

        public TestCase(ListNode head, int left, int right) {
            this.head = head;
            this.left = left;
            this.right = right;
        }
    }

    @Test
    public void testReverseBetween() {
        ListNode case1 = new ListNode(), tmp = case1;
        for (int i = 0; i < 5; i++) {
            case1.next = new ListNode(i + 1);
            case1 = case1.next;
        }
        ListNode ans = new ListNode();
        ans.next = new ListNode(1);
        ans.next.next = new ListNode(4);
        ans.next.next.next = new ListNode(3);
        ans.next.next.next.next = new ListNode(2);
        ans.next.next.next.next.next = new ListNode(5);
        TestCase[] cases = new TestCase[] { new TestCase(tmp.next, 2, 4) };

        for (int i = 0; i < cases.length; i++) {
            assertTrue(Utils.IsSameListNode(
                    ReversedLinkedList.reverseBetween(cases[i].head, cases[i].left, cases[i].right), ans.next));
        }
    }
}
