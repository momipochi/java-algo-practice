package com.example.LeetCode.L1466_ReorderRoutes;

import java.util.Stack;

// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/

/*
 * We start by defining an array of booleans that keeps track of visited cities and marking index 0 as true to jump start the algorithm.
 * We need to stacks in this solution, this first we will use at the beginning, the other later. We want to first iterate through all the
 * cities by looking into the connections. For every connection we check the FROM and TO index. If FROM index has been visited, this means
 * we need to increment counter and mark TO index as true. If TO index is visited then this naturally means FROM must have been visited as well
 * so we mark FROM index as true. If neither conditions match we add this index to the stack for later.
 * 
 * Once we finish, we need to declare the 2nd stack. While stack1 (s1) or stack2 (s2) isn't empty, we want to check both stacks one in order.
 * We check first s1, while s1 isn't empty we do the same check we did earlier, except this time we push the index to s2.
 * We repeat the same action with s2, of course, we push the index to s1 instead.
 * 
 * In the end we return the count;
 */

//previous solution hash 5ef16150a0177b015388cb963e40a63feeab0c2b

public class ReorderRoutes {
    public int minReorder(int n, int[][] connections) {
        boolean[] reach = new boolean[n];
        int rows = connections.length;
        reach[0] = true;
        int count = 0;

        Stack<Integer> s1 = new Stack<>();
        for (int i = 0; i < rows; i++) {
            if (reach[connections[i][0]]) {
                count++;
                reach[connections[i][1]] = true;
            } else if (reach[connections[i][1]]) {
                reach[connections[i][0]] = true;
            } else {
                s1.push(i);
            }
        }

        Stack<Integer> s2 = new Stack<>();

        while (!s1.isEmpty() || !s2.isEmpty()) {
            while (!s1.isEmpty()) {
                int i = s1.pop();
                if (reach[connections[i][0]]) {
                    count++;
                    reach[connections[i][1]] = true;
                } else if (reach[connections[i][1]]) {
                    reach[connections[i][0]] = true;
                } else {

                    s2.push(i);
                }

            }

            while (!s2.isEmpty()) {
                int i = s2.pop();
                if (reach[connections[i][0]]) {
                    count++;
                    reach[connections[i][1]] = true;
                } else if (reach[connections[i][1]]) {
                    reach[connections[i][0]] = true;
                } else
                    s1.push(i);
            }
        }
        return count;
    }
}
