package Medium;

class _2653_
{
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] frequency = new int[101];
        int[] beauties = new int[n - k + 1];

        for (int i = 0; i < k; i++)
            frequency[nums[i] + 50]++;

        int count = 0, pos;

        for (pos = 0; pos <= 100; pos++) {
            count += frequency[pos];

            if (count >= x)
                break;
        }

        beauties[0] = pos < 50 ? pos - 50 : 0;

        for (int i = 1; i <= n - k; i++) {
            frequency[nums[i - 1] + 50]--;
            frequency[nums[i + k - 1] + 50]++;
            count = 0;

            for (pos = 0; pos <= 100; pos++) {
                count += frequency[pos];

                if (count >= x)
                    break;
            }

            beauties[i] = pos < 50 ? pos - 50 : 0;
        }

        return beauties;
    }
}