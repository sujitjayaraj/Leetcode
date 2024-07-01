package Medium;

// String Compression III
// https://leetcode.com/problems/string-compression-iii/description/

class _3163_
{
    public String compressedString(String word) {
        StringBuilder temp = new StringBuilder();
        int currCount = 1;
        char currCh = word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == currCh) {
                if (currCount == 9) {
                    temp.append(String.valueOf(currCount) + currCh);
                    currCount = 0;
                }

                currCount++;
            }

            else {
                temp.append(String.valueOf(currCount) + currCh);
                currCount = 1;
                currCh = word.charAt(i);
            }
        }

        if (currCount > 0)
            temp.append(String.valueOf(currCount) + currCh);

        return temp.toString();
    }
}