package com.example.LeetCode.L11_ContainerWithMostWater;

// https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;

        while (l < r) {
            int curr = (r - l) * (height[l] < height[r] ? height[l] : height[r]);
            max = max > curr ? max : curr;
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
}
