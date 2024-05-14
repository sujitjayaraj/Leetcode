package Medium;

// House Robber
// https://leetcode.com/problems/house-robber/

public class _198_ {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+2];

        for(int i = nums.length - 1; i >= 0; i--){
            dp[i] = Math.max(nums[i] + dp[i+2], dp[i+1]);
        }

        return dp[0];
    }
}