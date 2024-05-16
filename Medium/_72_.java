package Medium;

// Edit Distance
// https://leetcode.com/problems/edit-distance/

import java.util.Arrays;

class _72_
{
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];

        for(int[] row: dp)
            Arrays.fill(row, Integer.MAX_VALUE);

        return recursiveMinDistance(word1, word2, 0, 0);
    }

    private int recursiveMinDistance(String a, String b, int i, int j){
        if(i >= a.length() && j >= b.length())
            return 0;
        
        else if(i >= a.length())
            return b.length() - j;
        
        else if(j >= b.length())
            return a.length() - i;
        
        else if(dp[i][j] < Integer.MAX_VALUE)
            return dp[i][j];

        int result = recursiveMinDistance(a, b, i+1, j+1);
        
        if(a.charAt(i) != b.charAt(j)){
            result = Math.min(result, recursiveMinDistance(a, b, i+1, j));
            result = Math.min(result, recursiveMinDistance(a, b, i, j+1));
            result++;
        }
        
        dp[i][j] = result;
        return result;
    }
}