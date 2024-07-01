package Medium;

// Path with Maximum Gold
// https://leetcode.com/problems/path-with-maximum-gold/

public class _1219_ {
    final static int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int getMaximumGold(int[][] grid) {
        int result = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] > 0) {
                    result = Math.max(result, recursiveMaxGoldPath(grid, visited, i, j));
                }
            }
        }

        return result;
    }

    private int recursiveMaxGoldPath(int[][] grid, boolean[][] visited, int i, int j) {
        int result = 0;
        visited[i][j] = true;

        for (int[] direction : directions) {
            int newI = i + direction[0];
            int newJ = j + direction[1];
            if (newI >= 0 && newJ >= 0 && newI < grid.length && newJ < grid[newI].length) {
                if (grid[newI][newJ] > 0 && !visited[newI][newJ]) {
                    result = Math.max(result, recursiveMaxGoldPath(grid, visited, newI, newJ));
                }
            }
        }

        visited[i][j] = false;

        return grid[i][j] + result;
    }
}