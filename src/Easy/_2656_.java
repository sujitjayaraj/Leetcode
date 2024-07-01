package Easy;

// Maximum Sum With Exactly K Elements
// https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/

class _2656_
{
    public int maximizeSum(int[] nums, int k) {
        int max = nums[0];

        for (int num : nums)
            if (num > max)
                max = num;

        return max * k + k * (k - 1) / 2;
    }
}