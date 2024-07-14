package Medium;

/**
 * Question 2657
 * <a href="https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/">Find The Prefix Common Array of Two Arrays</a>
 */

public class _2657_
{
    
    /**
     * Returns the prefix common array of two arrays such that the i<sup>th</sup> index
     * is equal to the count of numbers that are present at or before index i in
     * both arrays.
     * 
     * @param A First array of integers.
     * @param B Second array of integers.
     * @return The prefix common array of the two arrays.
     */
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