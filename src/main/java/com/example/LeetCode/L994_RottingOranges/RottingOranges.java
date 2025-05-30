package com.example.LeetCode.L994_RottingOranges;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[] { i, j });
                }
            }
        }
        List<int[]> l = new ArrayList<>();
        int res = 0;
        while (!q.isEmpty() || !l.isEmpty()) {
            while (!q.isEmpty()) {
                int[] coord = q.poll();
                bfs(coord[0] + 1, coord[1], l, grid);
                bfs(coord[0] - 1, coord[1], l, grid);
                bfs(coord[0], coord[1] + 1, l, grid);
                bfs(coord[0], coord[1] - 1, l, grid);
            }
            if (l.size() < 1) {
                continue;
            }
            res++;
            for (int i = 0; i < l.size(); i++) {
                q.add(l.get(i));
            }
            l.clear();
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }
        return res;
    }

    public void bfs(int x, int y, List<int[]> list, int[][] grid) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[x].length || grid[x][y] != 1) {
            return;
        }
        list.add(new int[] { x, y });
        grid[x][y] = 2;
    }
}
