package Medium;

// Find the Number of Good Pairs II
// https://leetcode.com/problems/find-the-number-of-good-pairs-ii/

import java.util.HashMap;

class _3164_
{
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