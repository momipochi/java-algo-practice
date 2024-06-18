package com.example.L2_AddTwoNumbers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.classes.ListNode;
import com.example.utils.Utils;

public class AddTwoNumbersTest {
    @Test
    public void testAddTwoNumbers() {
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = Utils.ArrayToListNode(new int[] { 2, 4, 3 }), l2 = Utils.ArrayToListNode(new int[] { 5, 6, 4 });
        ListNode ans = Utils.ArrayToListNode(new int[] { 7, 0, 8 });
        assertTrue(Utils.IsSameListNode(ans, atn.addTwoNumbers(l1, l2)));
    }
}
