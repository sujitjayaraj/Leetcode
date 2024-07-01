package Medium;

class _2486_
{
    public int appendCharacters(String s, String t) {
        char[] sArr = s.toCharArray(), tArr = t.toCharArray();
        int pos1 = 0, pos2 = 0;

        while (pos1 < sArr.length && pos2 < tArr.length)
            if (sArr[pos1++] == tArr[pos2])
                pos2++;

        return t.length() - pos2;
    }
}