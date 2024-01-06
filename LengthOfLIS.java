//Question 300 named Longest Increasing Subsequence

import java.util.Arrays;

class LengthOfLIS
{
    public static int main(int[] nums){
        int[] dp = new int[nums.length];
        int maxLength = 0, index = 0;
        
        for(int i=0; i<nums.length; i++){
            index = Arrays.binarySearch(dp, 0, maxLength, nums[i]);
            if(index < 0){
                index = -(index+1);
            }
            
            dp[index] = nums[i];
            if(index == maxLength){
                maxLength++;
            }
        }
        
        return maxLength;
    }
}