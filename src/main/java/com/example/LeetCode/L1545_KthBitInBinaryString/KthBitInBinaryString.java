package com.example.LeetCode.L1545_KthBitInBinaryString;

// https://leetcode.com/problems/find-kth-bit-in-nth-binary-string/
public class KthBitInBinaryString {
    public char findKthBit(int n, int k) {
        int b = 0b0, shiftSize = 1;
        for (int i = 1; i < n; i++) {
            int reversed = ~b;
            b <<= 0b1;
            b |= 0b1;
            b <<= shiftSize;
            b ^= reversed;
            shiftSize *= 2;
        }
        int m = (1 << 31) - 1;
        System.out.println(m & b);
        return '1';
        // TODO, this is not complete, needs to be fixed
    }
}
