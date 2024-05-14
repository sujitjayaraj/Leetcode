package Easy;

// First Unique Character in a String
// https://leetcode.com/problems/first-unique-character-in-a-string/

public class _387_ {
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