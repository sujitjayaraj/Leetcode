package Hard;

// Minimum Window Substring
// https://leetcode.com/problems/minimum-window-substring/

import java.util.HashMap;
import java.util.Map;

public class _76_ {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.isEmpty() || t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> targetMap = new HashMap<>();

        for (char ch : t.toCharArray()) {
            targetMap.put(ch, targetMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0, right = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;
        int requiredChars = targetMap.size();
        int formedChars = 0;
        Map<Character, Integer> windowMap = new HashMap<>();

        while (right < s.length()) {
            char currentChar = s.charAt(right);
            windowMap.put(currentChar, windowMap.getOrDefault(currentChar, 0) + 1);

            if (targetMap.containsKey(currentChar) && windowMap.get(currentChar).equals(targetMap.get(currentChar))) {
                formedChars++;
            }

            while (formedChars == requiredChars) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);

                if (targetMap.containsKey(leftChar) && windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    formedChars--;
                }

                left++;
            }

            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }
}