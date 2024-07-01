package Hard;

// Find Number of Ways to Reach the K-th Stair
// https://leetcode.com/problems/find-number-of-ways-to-reach-the-k-th-stair/

class _3154_
{
    public int waysToReachStair(int k) {
        int result = 0;

        for (int i = 0; i < 31; i++)
            result += combinations(i + 1, (1 << i) - k);

        return result;
    }

    private int combinations(int n, int k) {
        if (k < 0 || k > n)
            return 0;

        long result = 1;

        for (int i = 0; i < k; ++i)
            result = result * (n - i) / (i + 1);

        return (int) result;
    }
}