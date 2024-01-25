//Question 1143 named Longest Common Subsequence

import java.util.Arrays;
public class LongestCommonSubsequence
{
   int[][] dp;
    char[] str1, str2;
    public int longestCommonSubsequence(String text1, String text2) {
        str1 = text1.toCharArray();
        str2 = text2.toCharArray();
        dp = new int[str1.length][str2.length];

        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        
        int length = recursiveSequence(str1.length-1, str2.length-1);
        return length;
    }

    private int recursiveSequence(int i, int j){
        if(i < 0 || j < 0){
            return 0;
        }
        else if(dp[i][j] >= 0){
            return dp[i][j];
        }
        else if(str1[i] == str2[j]){
            dp[i][j] = recursiveSequence(i-1, j-1) + 1;
        }

        else{
            dp[i][j] = Math.max(recursiveSequence(i-1,j), recursiveSequence(i,j-1));
        }

        return dp[i][j];
    } 
}