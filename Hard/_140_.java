package Hard;

// Word Break II
// https://leetcode.com/problems/word-break-ii/description/

import java.util.List;
import java.util.ArrayList;

class _140_
{
    private String input;
    private List<String> result;

    public List<String> wordBreak(String s, List<String> wordDict) {
        input = s;
        result = new ArrayList<>();
        dfs(0, wordDict, new ArrayList<>());
        return result;
    }

    private void dfs(int index, List<String> wordDict, ArrayList<String> temp) {
        if (index == input.length()) {
            result.add(String.join(" ", temp.toArray(String[]::new)));
            return;
        }

        for (int i = index; i < input.length(); i++) {
            String sub = input.substring(index, i + 1);
            if (wordDict.contains(sub)) {
                temp.add(sub);
                dfs(i + 1, wordDict, temp);
                temp.remove(temp.size() - 1);
            }
        }
    }
}