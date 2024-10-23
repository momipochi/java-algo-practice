package com.example.LeetCode.L204_CountPrimes;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n + 1];

        for (int p = 2; p * p <= n; p++) {
            if (!prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!prime[i]) {
                count++;
            }
        }
        return count;
    }
}
