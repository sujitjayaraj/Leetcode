package Hard;

// Subarrays with K Different Integers
// https://leetcode.com/problems/subarrays-with-k-different-integers/

import java.util.HashMap;
import java.util.Map;

public class _992_ {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

    private int atMostKDistinct(int[] nums, int k) {
        int count = 0;
        int left = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

            while (freqMap.size() > k) {
                int leftNum = nums[left];
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if (freqMap.get(leftNum) == 0) {
                    freqMap.remove(leftNum);
                }
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}