//Question 70 named Climbing Stairs

class ClimbingStairs
{
    static int[] dp;
    
    public static int main(int n){
        dp = new int[n];
        return recursiveClimb(n);
    }
    
    private static int recursiveClimb(int n){
        if(n < 0){
            return 0;
        }
        else if(n == 0){
            return 1;
        }
        else if(dp[n-1] != 0){
            return dp[n-1];
        }
        
        dp[n-1] = recursiveClimb(n-1) + recursiveClimb(n-2);
        return dp[n-1];
    }
}