package main.Medium;

// Score After Flipping Matrix
// https://leetcode.com/problems/score-after-flipping-matrix/

public class _861_ {
    public int matrixScore(int[][] grid) {
        for(int[] row: grid){
            if(row[0] == 0){
                for(int i=0; i<row.length; i++)
                    row[i] = row[i] ^ 1;
            }
        }

        for(int i=1; i<grid[0].length; i++){
            int countOne = 0;
            for(int j=0; j<grid.length; j++){
                countOne += grid[j][i];
            }
            if(2*countOne < grid.length){
                for(int j=0; j<grid.length; j++)
                    grid[j][i] = grid[j][i] ^ 1;
            }
        }

        int sum = 0;
        for(int[] row: grid){
            for(int i=0; i<row.length; i++){
                sum += (int)Math.pow(2, row.length-1-i)*row[i];
            }
        }

        return sum;
    }
}
