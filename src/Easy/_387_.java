package Easy;

/**
 * <a href="https://leetcode.com/problems/first-unique-character-in-a-string/">First Unique Character in a String</a>
 */
public class _387_ {
    /**
     * Finds the index of the first non-repeating character in the given {@link String}.
     * 
     * @param s {@link String} consisting only of lowercase English letters.
     * @return Index of the first non-repeating character.
     */
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        char[] arr = s.toCharArray();

        for (char ch : arr) {
            count[ch - 'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i] - 'a'] == 1)
                return i;
        }

        return -1;
    }
}