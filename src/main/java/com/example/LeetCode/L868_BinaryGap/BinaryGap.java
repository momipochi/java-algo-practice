package com.example.LeetCode.L868_BinaryGap;

// https://leetcode.com/problems/binary-gap/description/

/*
 * By constantly shifting the number, it will eventually reach negative,
 * using that as a condition we can then iterate bit-wise and track our index using a counting variable
 */
public class BinaryGap {
    public int binaryGap(int n) {
        int max = 0, lastPos = -1, index = 0;
        while (n > 0) {
            int last = n & 1;
            index++;
            if (last == 1) {
                if (lastPos != -1) {
                    max = Math.max(max, index - lastPos);
                }
                lastPos = index;
            }
            n >>= 1;
        }
        return max;
    }
}
