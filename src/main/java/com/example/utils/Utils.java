package com.example.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.classes.ListNode;
import com.example.classes.TreeNode;

public class Utils {
    public static <T> List<List<T>> twoDimensionalArrayToList(T[][] arr) {
        List<List<T>> list = new ArrayList<>();
        for (T[] array : arr) {
            list.add(Arrays.asList(array));
        }
        return list;
    }

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

    public static boolean Is2DListEqualTo2DArray(List<List<String>> list, String[][] arr) {
        List<List<String>> arrList = new ArrayList<>();
        for (String[] num : arr) {
            List<String> tmp = Arrays.stream(num).toList();
            arrList.add(tmp);
        }
        try {
            return arrList.containsAll(list);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static ListNode ArrayToListNode(int[] arr) {
        ListNode node = new ListNode();
        node.next = new ListNode();
        node = node.next;
        ListNode tmp = node;
        for (int i = 0; i < arr.length; i++) {
            node.val = arr[i];
            node.next = new ListNode();
            node = node.next;
        }
        return tmp.next;
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

    public static boolean IsSameTreeNode(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;

        /* 2. both non-empty -> compare them */
        if (a != null && b != null)
            return (a.val == b.val
                    && IsSameTreeNode(a.left, b.left)
                    && IsSameTreeNode(a.right, b.right));

        /* 3. one empty, one not -> false */
        return false;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
