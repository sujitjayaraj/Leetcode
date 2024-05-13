package Medium;

import java.util.List;
public class _3148_ {
    public int maxScoreSize(List<List<Integer>> grid) {
        int m = grid.size();
        int n = grid.getFirst().size();
        int[][] dp = new int[m][n];
        dp[m - 1][n - 1] = (int) Math.pow(-10, 5); // Base case since no moves are possible from grid[m-1][n-1]
        int maxDiff = dp[m - 1][n - 1];
        int bottomDiff, rightDiff;

        // Calculating the dp values for bottomost row
        for (int i = n - 2; i >= 0; i--) {
            rightDiff = grid.get(m - 1).get(i + 1) - grid.get(m - 1).get(i);
            dp[m - 1][i] = Math.max(rightDiff, rightDiff + dp[m - 1][i + 1]);
            if (dp[m - 1][i] > maxDiff)
                maxDiff = dp[m - 1][i];
        }

        // Calculating the dp values for rightmost column
        for (int i = m - 2; i >= 0; i--) {
            bottomDiff = grid.get(i + 1).get(n - 1) - grid.get(i).get(n - 1);
            dp[i][n - 1] = Math.max(bottomDiff, bottomDiff + dp[i + 1][n - 1]);
            if (dp[i][n - 1] > maxDiff)
                maxDiff = dp[i][n - 1];
        }

        // Calculating the dp values for all other cells
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                rightDiff = grid.get(i).get(j + 1) - grid.get(i).get(j);
                bottomDiff = grid.get(i + 1).get(j) - grid.get(i).get(j);
                dp[i][j] = Math.max(Math.max(rightDiff, rightDiff + dp[i][j + 1]),
                        Math.max(bottomDiff, bottomDiff + dp[i + 1][j]));
                if (dp[i][j] > maxDiff)
                    maxDiff = dp[i][j];
            }
        }

        return maxDiff;
    }
}
