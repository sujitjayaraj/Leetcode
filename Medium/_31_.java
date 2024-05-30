package Medium;

// Next Permutation
// https://leetcode.com/problems/next-permutation/

import java.util.Arrays;

class _31_
{
    public void nextPermutation(int[] nums) {
        int index = nums.length - 2;

        while (index >= 0 && nums[index] >= nums[index + 1])
            index--;

        if (index >= 0) {
            int i = nums.length - 1;

            while (nums[i] <= nums[index])
                i--;

            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }

        Arrays.sort(nums, index + 1, nums.length);
    }
}