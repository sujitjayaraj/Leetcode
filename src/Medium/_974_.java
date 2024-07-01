package Medium;

class _974_
{
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0, count = 0;
        int[] freq = new int[k];
        freq[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                prefixSum += nums[i];

            else
                prefixSum += k - (-nums[i] % k);

            prefixSum %= k;
            count += freq[prefixSum]++;
        }

        return count;
    }
}