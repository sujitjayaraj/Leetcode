//Question 2870 named Minimum Number of Operations to Make Array Empty

import java.util.Arrays;

class MinOperations
{
    public static int main(int[] nums)
    {
        if(nums.length <= 1)
        {
            return -1;
        }
        Arrays.sort(nums);
        int i=0, count = 0, numCount = 0;
        
        while(i <= nums.length){
            while(i < nums.length && nums[i] == nums[i-1]){
                i++;
                numCount++;
            }
            if(numCount%3 == 0 || numCount%3 == 2){
                count += numCount / 3;
                numCount %= 3;
            }
            else if(numCount%3 == 1 && numCount != 1){
                count += (numCount / 3) - 1;
                numCount %= 3;
                numCount += 3;
            }
            if(numCount % 2 == 0){
                count += numCount / 2;
                numCount %= 2;
            }
            else{
                return -1;
            }
            i++;
            numCount = 1;
        }
        
        return count;
    }
}