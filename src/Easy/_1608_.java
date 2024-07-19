package Easy;

/**
 * <a href="https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/">
 * Special Array With X Elements Greater Than or Equal X</a>
 */
public class _1608_
{
    public int specialArray(int[] nums) {
        int left = 0, right = nums.length;

        while (left <= right) {
            int middle = (left + right) / 2, count = 0;

            for (int num : nums)
                if (num >= middle)
                    count++;

            if (count == middle)
                return middle;

            else if (count > middle)
                left = middle + 1;

            else if (count < middle)
                right = middle - 1;
        }

        return -1;
    }
}