package Medium;

// Find the Prefix Common Array of Two Arrays
// https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/

class _2657_
{
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] freq = new int[50];
        int[] C = new int[A.length];

        for (int i = 0; i < C.length; i++) {
            freq[A[i] - 1]++;
            freq[B[i] - 1]++;

            if (freq[A[i] - 1] == 2)
                C[i]++;

            if (freq[B[i] - 1] == 2 && A[i] != B[i])
                C[i]++;

            C[i] += i > 0 ? C[i - 1] : 0;
        }

        return C;
    }
}