package com.example.LeetCode.L3159_FindOccurrencesElementArray;

public class FindOccurrencesElementArray {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] acc = new int[nums.length];
        int count = 0;
        for (int i = 0; i < acc.length; i++) {
            if (nums[i] == x) {
                acc[count] = i;
                count++;
            }
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < acc.length; i++) {
            int q = queries[i];
            if (q > count) {
                res[i] = -1;
            } else {
                res[i] = acc[q - 1];
            }
        }
        return res;
    }
}
