package com.example.LeetCode.L64_MinPathSum;

public class MinPathSum {
    int[][] tab;

    public int minPathSum(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        tab = new int[row + 1][col + 1];
        return find(row - 1, col - 1, grid);
    }

    private int find(int i, int j, int[][] grid) {
        if (i == 0 && j == 0) {
            return grid[i][j];
        } else if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        } else if (tab[i][j] != 0) {
            return tab[i][j];
        }
        return tab[i][j] = grid[i][j] + Math.min(find(i - 1, j, grid), find(i, j - 1, grid));

    }


    public int minPathSumFromZero(int[][] grid) {
        int dp[][] = new int[grid.length+1][grid[0].length+1];
        return sum(grid,0,0,dp);    
    }
    public int sum(int arr[][], int i, int j, int dp[][]){
        if(i>=arr.length||j>=arr[0].length){
            return Integer.MAX_VALUE;
        }
        if(i==arr.length-1&&j==arr[0].length-1){
            return arr[i][j];
        }
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
        return dp[i][j] =arr[i][j] + Math.min(sum(arr,i,j+1,dp),sum(arr,i+1,j,dp));
    }
}
