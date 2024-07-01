package Easy;

import java.util.List;
import java.util.ArrayList;

class _1002_
{
    public List<String> commonChars(String[] words) {
        int[] count = new int[26];

        for (char ch : words[0].toCharArray())
            count[ch - 'a']++;

        for (int i = 1; i < words.length; i++) {
            int[] temp = new int[26];

            for (char ch : words[i].toCharArray())
                temp[ch - 'a']++;

            for (int j = 0; j < 26; j++)
                count[j] = Math.min(count[j], temp[j]);
        }

        List<String> result = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 1; j <= count[i - 'a']; j++)
                result.add(String.valueOf(i));
        }

        return result;
    }
}