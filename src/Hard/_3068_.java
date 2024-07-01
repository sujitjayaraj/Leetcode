package Hard;

class _3068_
{
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long sum = 0;
        int minDiff = Integer.MAX_VALUE;
        int count = 0;

        for (int i : nums) {
            if ((i ^ k) > i) {
                sum += i ^ k;
                count++;
            }

            else
                sum += i;

            minDiff = Math.min(minDiff, Math.abs((i ^ k) - i));
        }

        if (count % 2 == 0)
            return sum;

        return sum - minDiff;
    }
}