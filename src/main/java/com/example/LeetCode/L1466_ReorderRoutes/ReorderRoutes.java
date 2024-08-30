package com.example.LeetCode.L1466_ReorderRoutes;

// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/

public class ReorderRoutes {
    public int count = 0;
    boolean[] reachable;

    public int minReorder(int n, int[][] connections) {
        reachable = new boolean[connections.length + 1];
        reachable[0] = true;

        for (int i = 0; i < n; i++) {
            compute(i, connections);
        }
        return count;

    }

    public void compute(int currentEdge, int[][] connections) {
        if (currentEdge >= connections.length)
            return;
        int u = connections[currentEdge][0];
        int v = connections[currentEdge][1];
        if (reachable[v]) {
            reachable[u] = true;
            return;
        }
        if (reachable[u]) {
            count++;
            reachable[v] = true;
        } else {
            compute(currentEdge + 1, connections);
            if (reachable[v]) {
                reachable[u] = true;
                return;
            }
            if (reachable[u]) {
                count++;
                reachable[v] = true;
            }
        }

    }
}
