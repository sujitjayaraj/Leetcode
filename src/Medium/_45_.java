package Medium;

// Jump Game II
// https://leetcode.com/problems/jump-game-ii/

class _45_
{
    public int jump(int[] nums) {
        int n = nums.length;
        int curr = 0, minSteps = 0;

        while (curr < n - 1) {
            if (curr + nums[curr] >= n - 1)
                curr += nums[curr];

            else {
                int maxPos = curr + 1;
                for (int i = curr + 1; i <= curr + nums[curr]; i++) {
                    maxPos = nums[maxPos] + maxPos <= nums[i] + i ? i : maxPos;
                }

                curr = maxPos;
            }

            minSteps++;
        }

        return minSteps;
    }
}