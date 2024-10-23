package com.example.LeetCode.L118_PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            List<Integer> tmp = new ArrayList<>();

            if (i >= 3) {
                tmp.add(1);
                var t2 = res.get(i - 2);
                for (int j = 1; j < i - 1; j++) {
                    tmp.add(t2.get(j - 1) + t2.get(j));
                }
                tmp.add(1);
            } else {
                for (int j = 0; j < i; j++) {
                    tmp.add(1);
                }
            }
            res.add(tmp);
        }

        return res;
    }
}
