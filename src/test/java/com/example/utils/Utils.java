package com.example.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.classes.ListNode;

public class Utils {

    public static boolean Is2DListEqualTo2DArray(List<List<Integer>> list, int[][] arr) {
        List<List<Integer>> arrList = new ArrayList<>();
        for (int[] num : arr) {
            List<Integer> tmp = Arrays.stream(num).boxed().toList();
            arrList.add(tmp);
        }
        try {
            return arrList.containsAll(list);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean IsSameListNode(ListNode a, ListNode b) {
        while (a != null && b != null) {
            if (a.val != b.val) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }
}
