package Easy;

// Largest Local Values in a Matrix
// https://leetcode.com/problems/largest-local-values-in-a-matrix/

public class _2373_ {
    static int[][] directions = {{-1,-1}, {-1,0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n - 2][n - 2];
        for(int i=1; i<n-1; i++){
            for(int j=1; j<n-1; j++){
                for(int[] dir: directions)
                    if(maxLocal[i-1][j-1] < grid[i+dir[0]][j+dir[1]])
                        maxLocal[i-1][j-1] = grid[i+dir[0]][j+dir[1]];
            }
        }

        return maxLocal;
    }
}
