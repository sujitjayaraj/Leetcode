//Question 931 named Minimum Falling Path Sum

import java.util.Arrays;

class MinimumFallingPath
{
    private static int[][] dp, matrix;
    
    public static int main(int[][] matrix){
        dp = new int[matrix.length][matrix.length];
        MinimumFallingPath.matrix = matrix;
        for(int[] row: dp){
            Arrays.fill(row, -101);
        }
        int min = recursivePath(0, 0);
        for(int i=1; i<matrix.length; i++){
            int temp = recursivePath(0, i);
            min = temp < min ? temp : min;
        }
        return min;
    }
    
    private static int recursivePath(int x, int y){
        if(x == matrix.length - 1){
            dp[x][y] = matrix[x][y];
            return matrix[x][y];
        }
        int temp, temp2;
        temp = dp[x+1][y] != -101 ? dp[x+1][y] : recursivePath(x+1, y);
        if(y > 0){
            temp2 = dp[x+1][y-1] != -101 ? dp[x+1][y-1] : recursivePath(x+1, y-1);
            temp = temp2 < temp ? temp2 : temp;
        }
        if(y < matrix.length - 1){
            temp2 = dp[x+1][y+1] != -101 ? dp[x+1][y+1] : recursivePath(x+1, y+1);
            temp = temp2 < temp ? temp2 : temp;
        }
        dp[x][y] = matrix[x][y] + temp;
        return dp[x][y];
    }
}