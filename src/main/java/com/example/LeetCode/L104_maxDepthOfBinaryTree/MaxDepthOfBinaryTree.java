package com.example.LeetCode.L104_maxDepthOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.example.classes.TreeNode;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
public class MaxDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int c = 0;
        while (q.size() > 0) {
            int len = q.size();
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode node1 = q.poll();
                sub.add(node1.val);
                if (node1.left != null) {
                    q.offer(node1.left);
                }
                if (node1.right != null) {
                    q.offer(node1.right);
                }
            }
            ans.add(sub);
            c++;
        }
        return c;
    }
}
