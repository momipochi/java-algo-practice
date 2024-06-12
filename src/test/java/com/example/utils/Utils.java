package com.example.utils;

import java.util.List;

public class Utils {
    public static boolean Is2DListEqualTo2DArray(List<List<Integer>> list, int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (list.get(i).get(j) != arr[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
