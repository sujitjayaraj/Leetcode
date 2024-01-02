//Question 1 named Two Sum

import java.util.Arrays;

class TwoSum
{
    public static int[] main(int[] nums, int target)
    {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.parallelSort(nums);
        int i = 0, j = nums.length - 1;
        int[] result = new int[2];
        while(i <= j)
        {
            if(nums[i] + nums[j] == target){
                break;
            }
            else if(nums[i] + nums[j] > target){
                j--;
            }
            else{
                i++;
            }
        }
        Arrays.fill(result, -1);
        for(int k = 0; k < copy.length; k++){
            if(copy[k] == nums[i] && result[0] == -1){
                result[0] = k;
            }
            else if(copy[k] == nums[j] && result[1] == -1){
                result[1] = k;
            }
        }
        Arrays.sort(result);
        return result;
    }
}