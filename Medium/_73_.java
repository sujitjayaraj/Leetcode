package Medium;

// Subsets
// https://leetcode.com/problems/subsets/

import java.util.List;
import java.util.ArrayList;

class _73_
{
    private List<List<Integer>> result;

    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        recursiveSubset(nums, new ArrayList<>(), 0);
        return result;
    }

    private void recursiveSubset(int[] nums, List<Integer> subset, int index) {
        if (index == nums.length)
            result.add(subset);

        else {
            recursiveSubset(nums, subset, index + 1);
            ArrayList<Integer> copy = new ArrayList<>(subset);
            copy.add(nums[index]);
            recursiveSubset(nums, copy, index + 1);
        }
    }
}