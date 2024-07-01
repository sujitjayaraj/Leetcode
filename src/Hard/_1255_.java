package Hard;

// Maximum Score Words Formed by Letters
// https://leetcode.com/problems/maximum-score-words-formed-by-letters/

class _1255_
{
    private String[] words;
    private int[] score;

    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        this.words = words;
        this.score = score;

        int[] letterCount = new int[26];

        for (char ch : letters)
            letterCount[ch - 'a']++;

        return recursiveSubset(letterCount, 0, 0);
    }

    private int recursiveSubset(int[] letterCount, int index, int currScore) {
        if (index == words.length)
            return currScore;

        int result = recursiveSubset(letterCount, index + 1, currScore);

        int temp = 0;
        boolean bool = true;

        for (char ch : words[index].toCharArray()) {
            if (letterCount[ch - 'a'] <= 0)
                bool = false;

            letterCount[ch - 'a']--;
            temp += score[ch - 'a'];
        }

        if (bool)
            result = Math.max(result, recursiveSubset(letterCount, index + 1, currScore + temp));

        for (char ch : words[index].toCharArray())
            letterCount[ch - 'a']++;

        return result;
    }
}