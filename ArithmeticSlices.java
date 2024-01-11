//Question 446 named Arithmetic Slices II - Subsequence

import java.util.HashMap;

class ArithmeticSlices
{
    public static int main(int[] nums){
        int result = 0;
        
        HashMap<Integer, Integer>[] dp = new HashMap[nums.length];
        
        for(int i=0; i<nums.length; i++){
            dp[i] = new HashMap<Integer, Integer>();
            for(int j=0; j<i; j++){
                long diff = (long)nums[i] - nums[j];
                if(diff >= Integer.MIN_VALUE && diff <= Integer.MAX_VALUE){
                    int diffInt = (int)diff;
                    int count = dp[j].getOrDefault(diffInt, 0);
                    result += count;
                    dp[i].put(diffInt, dp[i].getOrDefault(diffInt, 0) + count);
                    dp[i].put(diffInt, dp[i].getOrDefault(diffInt, 0) + 1);
                }
                
                
            }
        }
        
        return result;
    }
}