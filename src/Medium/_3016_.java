package Medium;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/">Minimum Number of Pushes to Type Word II</a>
 */
public class _3016_
{
    /**
     * Calculates minimum number of pushes to type the input {@link String} remapped to keys numbered 2 to 9.
     * 
     * @param word Input {@link String}.
     * @return Minimum number of pushes to type the input {@link String}.
     */
    public int minimumPushes(String word) {
        int[] letters = new int[26];
        int result = 0, count = 0;

        for (char ch : word.toCharArray())
            letters[ch - 'a']++;

        Arrays.sort(letters);

        for (int i = 25; i >= 0 && letters[i] > 0; i--)
            result += letters[i] * (count++ / 8 + 1);

        return result;
    }
}