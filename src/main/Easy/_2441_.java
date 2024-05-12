package main.Easy;

// Largest Positive Integer That Exists With Its Negative
// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/

import java.util.HashSet;
import java.util.Set;

public class _2441_ {
    public int findMaxK(int[] nums) {
        int result = -1;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.contains(-num)) {
                int temp = Math.abs(num);
                result = Math.max(result, temp);
            }
        }
        return result;
    }
}