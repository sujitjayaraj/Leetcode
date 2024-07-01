package Medium;

// Jump Game
// https://leetcode.com/problems/jump-game/

class _55_
{
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int curr = 0, minSteps = 0;

        while (curr < n - 1) {
            if(nums[curr] == 0)
                return false;

            else if (curr + nums[curr] >= n - 1)
                return true;

            int maxPos = curr;
            for (int i = curr + 1; i <= curr + nums[curr]; i++) {
                maxPos = nums[maxPos] + maxPos <= nums[i] + i ? i : maxPos;
            }

            curr = maxPos;
        }

        return true;
    }
}