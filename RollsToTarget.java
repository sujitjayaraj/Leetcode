//Question 1155 named Number of Dice Rolls With Target Sum

class RollsToTarget
{
    private static int[][] dp;
    private static int k;
    public static int main(int n, int k, int target){
        dp = new int[n+1][target+1];
        RollsToTarget.k = k;
        for(int i=1; i<=k && i<= target; i++){
            dp[1][i] = 1;
        }
        return recursiveRolls(n, k, target);
    }
    
    private static int recursiveRolls(int n, int k, int target){
        if(n == 0){
            if(target == 0){
                dp[n][target] = 1;
                return 1;
            }
            else{
                dp[n][target] = -1;
                return 0;
            }
        }
        else if(n > target){
            dp[n][target] = -1;
            return 0;
        }
        else if(n*k < target){
            dp[n][target] = -1;
            return 0;
        }
        
        int sum = 0;
        for(int i=1; i<=k; i++){
            if(target - i >= 0){
                if(dp[n-1][target - i] == 0){
                    sum += recursiveRolls(n-1, k, target - i);
                }
                else if(dp[n-1][target-i] > 0){
                    sum += dp[n-1][target-i];
                }
            }
            sum = sum % (int)(Math.pow(10,9) + 7);
        }
        dp[n][target] = sum;
        return sum;
    }
}