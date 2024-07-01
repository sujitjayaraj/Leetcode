package Easy;

class _344_
{
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        char temp;

        while (left < right) {
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}