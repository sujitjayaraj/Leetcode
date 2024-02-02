//Question 2966 named Divide Array Into Arrays With Max Difference

import java.util.Arrays;
public class DivideMaxDiffArray
{
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[nums.length/3][3];
        boolean possible = true;
        for(int i=0; i<nums.length; i += 3){
            if(nums[i+2] - nums[i] <= k){
                result[i/3] = Arrays.copyOfRange(nums, i, i+3);
            }
            else{
                possible = false;
                break;
            }
        }
        if(!possible){
            return new int[0][0];
        }

        return result;
    }
}