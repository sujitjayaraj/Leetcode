package Medium;

// Partition Array for Maximum Sum
// https://leetcode.com/problems/partition-array-for-maximum-sum/

public class _1043_ {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length + 1];

        for (int i = 1; i <= arr.length; i++) {
            int maxVal = 0;
            for (int j = 1; j <= k && i - j >= 0; j++) {
                maxVal = Math.max(maxVal, arr[i - j]);
                dp[i] = Math.max(dp[i], dp[i - j] + maxVal * j);
            }
        }

        return dp[arr.length];
    }
}