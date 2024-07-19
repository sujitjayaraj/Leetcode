package Medium;

/**
 * <a href="https://leetcode.com/problems/house-robber/">House Robber</a>
 */
public class _198_ {
    /**
     * Calculates the maximum amount of money you can rob in a single night without alerting the police.
     * 
     * @param nums Integer array representing the amount of money in each house.
     * @return Maximum amount of money you can rob in a single night without alerting the police.
     */
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+2];

        for(int i = nums.length - 1; i >= 0; i--){
            dp[i] = Math.max(nums[i] + dp[i+2], dp[i+1]);
        }

        return dp[0];
    }
}