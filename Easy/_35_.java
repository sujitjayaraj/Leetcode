package Easy;

// Search Insert Position
// https://leetcode.com/problems/search-insert-position/

import java.util.Arrays;

class _35_
{
    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);

        if (index < 0)
            index = -index - 1;

        return index;
    }
}