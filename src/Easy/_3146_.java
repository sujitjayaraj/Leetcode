package Easy;

// Permutation Difference Between Two Strings
// https://leetcode.com/problems/permutation-difference-between-two-strings
public class _3146_ {
    public int findPermutationDifference(String s, String t){
        int diff = 0;
        for(int i=0; i<t.length(); i++)
            diff += Math.abs(i - s.indexOf(t.charAt(i)));

        return diff;
    }
}