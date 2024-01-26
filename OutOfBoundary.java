//Question 576 named Out of Boundary Paths

public class OutOfBoundary
{
    final static int MOD = 1_000_000_007;
    final static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][] dpCurr = new int[m][n], dpNext;

        dpCurr[startRow][startColumn] = 1;

        int result = 0;

        for (int move = 0; move < maxMove; move++) {
            dpNext = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] direction : directions) {
                        int ni = i + direction[0];
                        int nj = j + direction[1];

                        if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                            dpNext[ni][nj] = (dpNext[ni][nj] + dpCurr[i][j]) % MOD;
                        } else {
                            result = (result + dpCurr[i][j]) % MOD;
                        }
                    }
                }
            }

            dpCurr = dpNext;
        }

        return result;
    }
}
