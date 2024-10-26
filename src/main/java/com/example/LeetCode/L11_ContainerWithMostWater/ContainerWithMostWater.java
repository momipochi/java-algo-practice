package com.example.LeetCode.L11_ContainerWithMostWater;

// https://leetcode.com/problems/container-with-most-water/description/
public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;

        while (l < r) {
            int curr = (r - l);
            if (height[l] < height[r]) {
                curr *= height[l];
                l++;
            } else {
                curr *= height[r];
                r--;
            }
            max = max > curr ? max : curr;
        }
        return max;
    }
}
