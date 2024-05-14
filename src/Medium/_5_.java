package Medium;

// Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/

public class _5_ {
    public String longestPalindrome(String s) {
        int n = s.length();
        char[] sArr = s.toCharArray();
        boolean[][] dp = new boolean[n][n];
        int start = 0, end = 0;
        for(int i=0; i<n; i++)
            dp[i][i] = true;

        for(int i=0; i<=n-2; i++)
            if(sArr[i] == sArr[i+1]){
                dp[i][i+1] = true;
                start = i;
                end = i+1;
            }

        for(int i=3; i<=n; i++){
            for(int j=0; j<=n-i; j++){
                if(dp[j+1][j+i-2] && sArr[j] == sArr[j+i-1]){
                    dp[j][j+i-1] = true;
                    start = j;
                    end = j+i-1;
                }
            }
        }

        return s.substring(start, end+1);
    }
}
