package Medium;

// Special Array II
// https://leetcode.com/problems/special-array-ii/

import java.util.ArrayList;

class _3152_
{
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        ArrayList<Integer> idx = new ArrayList<>();
        idx.add(0);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2)
                idx.add(i);
        }

        idx.add(nums.length);

        boolean[] answer = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int x = queries[i][0], y = queries[i][1];
            int left = 0, right = idx.size() - 1, middle = 0;

            while (left <= right) {
                middle = (left + right) / 2;

                if (idx.get(middle) <= x && idx.get(middle + 1) > y)
                    break;

                else if (idx.get(middle) > x)
                    right = middle - 1;

                else if (idx.get(middle) <= y)
                    left = middle + 1;
            }

            if (left > right)
                answer[i] = false;

            else
                answer[i] = true;
        }

        return answer;
    }
}