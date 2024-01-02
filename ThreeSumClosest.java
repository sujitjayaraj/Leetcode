//Question 16 named 3Sum Closest

import java.util.Arrays;

class ThreeSumClosest
{
    public static int main(int[] nums, int target){
        Arrays.sort(nums);
        int sum = nums[0]+nums[1]+nums[2];
        if(nums.length == 3){
            return sum;
        }
        
        for(int i=0; i<nums.length-2 && sum != target; i++){
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if(Math.abs(sum-target) > Math.abs(nums[i]+nums[left]+nums[right]-target)){
                    sum = nums[i]+nums[left]+nums[right];
                }
                if(nums[i]+nums[left]+nums[right] > target){
                    right--;
                }
                else if(nums[i]+nums[left]+nums[right] < target){
                    left++;
                }
                else{
                    sum = target;
                    break;
                }
            }
        }
        return sum;
    }
}