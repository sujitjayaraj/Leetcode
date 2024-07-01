package Hard;

// Student Attendance Record II
// https://leetcode.com/problems/student-attendance-record-ii/

import java.util.Arrays;

class _552_
{
    private static final int MOD = 1000000007;

    public int checkRecord(int n) {
        int[][][] dp = new int[n + 1][2][3];

        for (int[] row : dp[0])
            Arrays.fill(row, 1);

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    dp[i][j][k] += dp[i - 1][j][2];

                    if (j > 0) {
                        dp[i][j][k] += dp[i - 1][j - 1][2];
                        dp[i][j][k] %= MOD;
                    }

                    if (k > 0) {
                        dp[i][j][k] += dp[i - 1][j][k - 1];
                        dp[i][j][k] %= MOD;
                    }
                }
            }
        }

        return dp[n][1][2];
    }
}