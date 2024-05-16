package Medium;

// Minimum Path Sum
// https://leetcode.com/problems/minimum-path-sum/

import java.util.Arrays;

public class _64_
{
    int[][] dp;
    final static int[][] directions = { { 0, 1 }, { 1, 0 } };

    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        dp = new int[n][m];
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);

        dp[n - 1][m - 1] = grid[n - 1][m - 1];
        return recursiveMinPath(grid, 0, 0);
    }

    private int recursiveMinPath(int[][] grid, int i, int j) {
        if (i >= grid.length || j >= grid[i].length)
            return Integer.MAX_VALUE;

        else if (dp[i][j] < Integer.MAX_VALUE)
            return dp[i][j];

        int result = Math.min(recursiveMinPath(grid, i + 1, j), recursiveMinPath(grid, i, j + 1));
        dp[i][j] = grid[i][j] + result;
        return dp[i][j];
    }
}