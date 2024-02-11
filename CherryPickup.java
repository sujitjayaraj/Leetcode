//Question 1463 named Cherry Pickup II

class CherryPickup
{
    public int cherryPickup(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][][] dp = new int[m][n][n];
        
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int maxCherries = 0;
                    
                    maxCherries += grid[i][j];
                    
                    if (j != k) {
                        maxCherries += grid[i][k];
                    }
                    
                    if (i != m - 1) {
                        int nextMax = 0;
                        for (int nj = j - 1; nj <= j + 1; nj++) {
                            for (int nk = k - 1; nk <= k + 1; nk++) {
                                if (nj >= 0 && nj < n && nk >= 0 && nk < n) {
                                    nextMax = Math.max(nextMax, dp[i + 1][nj][nk]);
                                }
                            }
                        }
                        maxCherries += nextMax;
                    }
                    
                    dp[i][j][k] = maxCherries;
                }
            }
        }
        
        return dp[0][0][n - 1];
    }
}