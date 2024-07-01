package Hard;

import java.util.Arrays;

class _132_ {
    public int minCut(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int[] count = new int[s.length()];

        for (int i = 0; i < dp.length; i++)
            dp[i][i] = true;

        for (int i = 0; i < dp.length - 1; i++) {
            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);

            if (!dp[i][i + 1])
                count[i]++;
        }

        for (int i = 2; i < dp.length; i++) {
            for (int j = 0; j < dp.length - i; j++) {
                dp[j][j + i] = dp[j + 1][j + i - 1] && s.charAt(j) == s.charAt(j + i); // aaabaa
            }
        }
        //   a a b a a
        // a T T F T T
        // a T T F T T
        // b F F T F F
        // a T T F T T
        // a T T F T T

        for(boolean[] row: dp)
            System.out.println(Arrays.toString(row));

        int start = 0, cuts = -1;

        while (start < s.length()) {
            int end;

            for (end = s.length() - 1; end >= start; end--) {
                if (dp[start][end])
                    break;
            }

            start = end + 1;
            cuts++;
        }

        return cuts;
    }

    public static void main(String[] args) {
        _132_ sol = new _132_();
        System.out.println(sol.minCut("aaabaa"));
    }
}
