package Medium;

// Single Number III
// https://leetcode.com/problems/single-number-iii/description/

class _260_ {
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