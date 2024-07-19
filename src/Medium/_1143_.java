package Medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/longest-common-subsequence/">Longest Common Subsequence</a>
 */
public class _1143_ {
    int[][] dp;
    char[] str1, str2;
    
    /**
     * Calculates the length of the longest common subsequence between two given {@link String}.
     * 
     * @param text1 {@link String} first text input.
     * @param text2 {@link String} second text input.
     */
    public int longestCommonSubsequence(String text1, String text2) {
        str1 = text1.toCharArray();
        str2 = text2.toCharArray();
        dp = new int[str1.length][str2.length];

        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }

        return recursiveSequence(str1.length - 1, str2.length - 1);
    }

    private int recursiveSequence(int i, int j) {
        if (i < 0 || j < 0) {
            return 0;
        }

        else if (dp[i][j] >= 0) {
            return dp[i][j];
        }

        else if (str1[i] == str2[j]) {
            dp[i][j] = recursiveSequence(i - 1, j - 1) + 1;
        }

        else {
            dp[i][j] = Math.max(recursiveSequence(i - 1, j), recursiveSequence(i, j - 1));
        }

        return dp[i][j];
    }
}