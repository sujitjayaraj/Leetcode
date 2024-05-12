package main.Easy;

// Reverse Prefix of Word
// https://leetcode.com/problems/reverse-prefix-of-word
public class _2000_ {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1)
            return word;

        char[] arr = word.toCharArray();
        for (int i = 0; i <= index / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[index - i];
            arr[index - i] = temp;
        }

        return new String(arr);
    }
}
