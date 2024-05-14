package Medium;

// Minimum Length of String After Deleting Similar Ends
// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/

public class _1750_ {
    public int minimumLength(String s) {
        char[] arr = s.toCharArray();
        int first = 0;
        int last = arr.length - 1;

        while (first < arr.length && last >= 0 && arr[first] == arr[last] && first < last) {
            char c = arr[first];

            while (first < arr.length && arr[first] == c && first <= last) {
                first++;
            }

            while (last >= 0 && arr[last] == c && first < last) {
                last--;
            }
        }

        return last - first + 1;
    }
}
