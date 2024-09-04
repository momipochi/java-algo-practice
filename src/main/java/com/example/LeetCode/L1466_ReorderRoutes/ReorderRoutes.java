package com.example.LeetCode.L1466_ReorderRoutes;

// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/

/*
 * The idea of the algorithm is to bfs approach. For each point we check whether the connections 
 * lead back, or in this impelmentation, we check using an array of boolean if a point has been visited.
 * This is possible because the connections are guaranteed to start from 0 and there is no skipping to
 * the next number, meaning we can use the values of each point as an index to easily mark the element
 * in the boolean array as true, aka visited.
 * 
 * There are two important things to remember. First, it is possible that a point is reachable, hence
 * we return from the function early and never reach the recursion part of the function, meaning we will
 * not iterate through all points properly. The solution is to simply iterate from 0 to n (number of cities)
 * and compute for each city.
 * 
 * Secondly, it is possible that a city turns out to be reachable if we traverse further down, so after the
 * recursion, we need to make the same check once again to make sure that any changes made during the recursion,
 * we verify if those "future actions" had any effects to current cities.
 */

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
