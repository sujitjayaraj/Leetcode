package Medium;

// Sum of Digit Differences of All Pairs
// https://leetcode.com/problems/sum-of-digit-differences-of-all-pairs/

class _3153_
{
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        int digitCount = String.valueOf(nums[0]).length();
        int[][] frequencies = new int[digitCount][10];

        for(int i=0; i<n; i++){
            String numStr = String.valueOf(nums[i]);

            for(int j=0; j<digitCount; j++)
                frequencies[j][numStr.charAt(j) - '0']++;
        }

        long digitDifferences = 0;

        for(int[] frequency: frequencies){
            for(int i: frequency)
                digitDifferences += i * (n - i);
        }

        return digitDifferences / 2;
    }
}