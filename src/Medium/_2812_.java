package Medium;

// Find the Safest Path in a Grid
// https://leetcode.com/problems/find-the-safest-path-in-a-grid/

import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayDeque;
import java.util.Arrays;

class _2812_ {
    int[][] d;
    int n;
    static int[][] directions = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

    public int maximumSafenessFactor(List<List<Integer>> grid) {
        n = grid.size();
        d = new int[n][n];

        if (grid.get(0).get(0) == 1 || grid.get(n - 1).get(n - 1) == 1)
            return 0;

        for (int[] row : d)
            Arrays.fill(row, Integer.MAX_VALUE);

        bfs(grid);

        boolean[][] vis = new boolean[n][n];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        queue.offer(new int[] { d[0][0], 0, 0 });

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int minDistance = curr[0];
            int x = curr[1], y = curr[2];

            if (x == n - 1 && y == n - 1)
                return minDistance;
            vis[x][y] = true;

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newY >= 0 && newX < n && newY < n && !vis[newX][newY]) {
                    queue.offer(new int[] { Math.min(minDistance, d[newX][newY]), newX, newY });
                    vis[newX][newY] = true;
                }
            }
        }

        return -1;
    }

    private void bfs(List<List<Integer>> grid) {
        boolean[][] vis = new boolean[n][n];
        ArrayDeque<int[]> queue = new ArrayDeque<>();

        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid.size(); j++) {
                if (grid.get(i).get(j) == 1) {
                    queue.offer(new int[] { i, j });
                    d[i][j] = 0;
                    vis[i][j] = true;
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            for (int[] dir : directions) {
                int newX = curr[0] + dir[0];
                int newY = curr[1] + dir[1];
                if (newX >= 0 && newY >= 0 && newX < n && newY < n && !vis[newX][newY]) {
                    d[newX][newY] = d[curr[0]][curr[1]] + 1;
                    vis[newX][newY] = true;
                    queue.offer(new int[] { newX, newY });
                }
            }
        }
    }
}