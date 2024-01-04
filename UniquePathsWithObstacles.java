//Question 63 named Unique Paths II

class UniquePathsWithObstacles
{
    public static int main(int [][] obstacleGrid){
        for(int i=0; i<obstacleGrid.length; i++){
            for(int j=0; j<obstacleGrid[i].length; j++){
                if(obstacleGrid[i][j] == 1){
                    obstacleGrid[i][j] = 0;
                }
                else{
                    obstacleGrid[i][j] = -1;
                }
            }
        }
        return recursiveUniquePaths(0, 0, obstacleGrid);
    }
    private static int recursiveUniquePaths(int x, int y, int[][] obstacleGrid){
        if(obstacleGrid[x][y] != -1){
            return obstacleGrid[x][y];
        }
        
        if(x == obstacleGrid.length - 1 && y == obstacleGrid[obstacleGrid.length - 1].length - 1){
            obstacleGrid[x][y] = 1;
            return 1;
        }

        int path1 = 0, path2 = 0;
        if(x < obstacleGrid.length - 1){
            path1 = recursiveUniquePaths(x+1, y, obstacleGrid);
        }
        if(y < obstacleGrid[x].length - 1){
            path2 = recursiveUniquePaths(x, y+1, obstacleGrid);
        }
        
        obstacleGrid[x][y] = path1 + path2;
        return path1 + path2;
    }
}