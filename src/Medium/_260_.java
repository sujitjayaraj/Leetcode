package Medium;

/**
 * <a href="https://leetcode.com/problems/single-number-iii/description/">Single Number III</a>
 */
public class _260_ {
    /**
     * Finds the two elements that appear only once in the given array.
     * 
     * @param nums Array in which exactly two elements appear only once and
     * all the other elements appear exactly twice.
     * @return Array containing the two elements.
     */
    public int[] singleNumber(int[] nums) {
        int xor = 0, diff;
        int[] result = new int[2];

        for (int num : nums)
            xor ^= num;

        diff = Integer.lowestOneBit(xor);

        for (int num : nums) {
            if ((num & diff) == diff)
                result[0] ^= num;

            else
                result[1] ^= num;
        }

        return result;
    }
}