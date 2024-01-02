//Question 15 named 3Sum

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class ThreeSum
{
    public static List<List<Integer>> main(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if(nums[j]+nums[k]==-nums[i]){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if(nums[j]+nums[k] > -nums[i]){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return result;
    }
}