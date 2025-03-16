package Easy;

/**
 * <a href="https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/">Make Two Arrays Equal By Reversing Subarrays</a>
 */
public class _1460_
{
    /**
     * Checks if two integer arrays can be made equal by reversing a non-empty subarray of arr.
     * 
     * @param arr Input integer array
     * @param target Target integer array
     * @return Returns true if both arrays can be made equal, else false.
     */
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] map = new int[1000];

        for (int num : target)
            map[num - 1]++;

        for (int num : arr)
            if (map[num - 1] == 0)
                return false;

            else
                map[num - 1]--;

        return true;
    }
}