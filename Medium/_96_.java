package Medium;

public class _96_
{
    int[] dp = new int[19];
    
    public int numTrees(int n) {
        if (n == 0 || n == 1)
            return 1;

        else if (dp[n - 1] != 0)
            return dp[n - 1];
            
        int result = 0;

        for (int i = 0; i < n; i++)
            result += numTrees(i) * numTrees(n - 1 - i);

        dp[n - 1] = result;
        return result;
    }
}