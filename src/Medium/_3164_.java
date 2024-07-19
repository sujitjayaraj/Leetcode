package Medium;

import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/find-the-number-of-good-pairs-ii/">
 * Find the Number of Good Pairs II</a>
 */
class _3164_
{
    /**
     * Calculates the total number of good pairs.
     * A pair (i, j) is called good if nums1[i] is divisible by nums2[j] * k (0 <= i <= n - 1, 0 <= j <= m - 1).
     * 
     * @param nums1 First input integer array.
     * @param nums2 Second input integer array.
     * @param k A positive integer.
     * @return Total number of good pairs.
     */
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums2)
            freq.put(num * k, freq.getOrDefault(num * k, 0) + 1);

        long count = 0;

        for (int num : nums1) {
            for (int i = 1; i * i <= num; i++) {
                if (num % i == 0) {
                    if (freq.containsKey(i))
                        count += freq.get(i);

                    int temp = num / i;

                    if (temp > i && freq.containsKey(temp))
                        count += freq.get(temp);
                }
            }
        }

        return count;
    }
}