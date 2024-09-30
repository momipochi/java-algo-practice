package com.example.LeetCode.L1466_ReorderRoutes;

// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/

/*
 * The idea of the algorithm is to bfs approach. For each point we check whether the connections 
 * lead back, or in this impelmentation, we check using an array of boolean if a point has been visited.
 * This is possible because the connections are guaranteed to start from 0 and there is no skipping to
 * the next number, meaning we can use the values of each point as an index to easily mark the element
 * in the boolean array as true, aka visited.
 * 
 * When running recursive function, we check if the TO index is marked as true in the boolean array. If
 * true, this means that FROM has also been visited and we can return early. If instead FROM was visited, this means that TO
 * needs to be reordered. If neither are the case we need to run the search again recrusively for the next
 * city.
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
    boolean[] visited;
    int reorders = 0;

    public int minReorder(int n, int[][] connections) {
        visited = new boolean[n + 1];
        visited[0] = true;
        for (int i = 0; i < n; i++) {
            search(i, connections);
        }
        return reorders;
    }

    private void search(int city, int[][] connections) {
        if (city >= connections.length || city < 0) {
            return;
        }
        int from = connections[city][0], to = connections[city][1];
        if (visited[to]) {
            visited[from] = true;
            return;
        }
        if (visited[from]) {
            reorders++;
            visited[to] = true;
        } else {
            search(city + 1, connections);
            if (visited[to]) {
                visited[from] = true;
                return;
            }
            if (visited[from]) {
                reorders++;
                visited[to] = true;
            } else {
                search(city - 1, connections);
            }
        }

    }

}
