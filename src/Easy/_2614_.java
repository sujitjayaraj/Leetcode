package Easy;

// Prime In Diagonal
// https://leetcode.com/problems/prime-in-diagonal/

class _2614_
{
    public int diagonalPrime(int[][] nums) {
        int prime = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i][i] > prime && checkPrime(nums[i][i]))
                prime = nums[i][i];

            if (nums[i][nums.length - i - 1] > prime && checkPrime(nums[i][nums.length - i - 1]))
                prime = nums[i][nums.length - i - 1];
        }

        return prime;
    }

    private boolean checkPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;

        return true;
    }
}