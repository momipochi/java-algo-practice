package com.example.LeetCode.L1424_DiagonalTraverseII;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DiagonalTraverseII {
    class Tuple {
        public int x;
        public int y;

        public Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        Queue<Tuple> q = new LinkedList<Tuple>();
        q.add(new Tuple(0, 0));
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            Tuple item = q.poll();
            res.add(nums.get(item.x).get(item.y));
            if (item.y == 0 && item.x + 1 < nums.size()) {
                q.add(new Tuple(item.x + 1, item.y));
            }
            if (item.y+1 < nums.get(item.x).size()) {
                q.add(new Tuple(item.x, item.y + 1));
            }
        }
        return res.stream().mapToInt(x -> x.intValue()).toArray();
    }
}
