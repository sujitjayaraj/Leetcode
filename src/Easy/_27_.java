package Easy;

// Remove Element
// https://leetcode.com/problems/remove-element/

class _27_
{
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for(int i=0; i<nums.length - k; i++){
            if(nums[i] == val){
                nums[i] = nums[nums.length - k - 1];
                k++;
                i--;
            }
        }

        return nums.length - k;
    }
}