package Easy;

// Relative Ranks
// https://leetcode.com/problems/relative-ranks/

import java.util.Arrays;

public class _506_ {
    static final String[] medals = { "Gold Medal", "Silver Medal", "Bronze Medal" };

    public String[] findRelativeRanks(int[] score) {
        Integer[] indices = new Integer[score.length];
        for (int i = 0; i < score.length; i++)
            indices[i] = i;

        Arrays.sort(indices, (x, y) -> score[y] - score[x]);
        String[] result = new String[score.length];
        for (int i = 0; i <= 2 && i < score.length; i++)
            result[indices[i]] = medals[i];

        for (int i = 3; i < score.length; i++)
            result[indices[i]] = String.valueOf(i + 1);

        return result;
    }
}