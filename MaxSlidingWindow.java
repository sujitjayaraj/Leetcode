//Question 239 named Sliding Window Maximum

class MaxSlidingWindow
{
    public static int[] main(int[] nums, int k){
        int maxPos = -1;
        int[] result = new int[nums.length-k+1];
        
        for(int i=0; i<result.length; i++){
            if(maxPos < i){
                maxPos = i;
                for(int j=i+1; j<=k+i-1; j++){
                    if(nums[maxPos] <= nums[j]){
                        maxPos = j;
                    }
                }
            }
            else{
                if(nums[maxPos] <= nums[k+i-1]){
                    maxPos = k+i-1;
                }
            }
            result[i] = nums[maxPos];
        }
        
        return result;
    }
}