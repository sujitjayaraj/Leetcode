package Medium;

// Get Equal Substrings Within Budget
// https://leetcode.com/problems/get-equal-substrings-within-budget/

class _1208_
{
    public int equalSubstring(String s, String t, int maxCost) {
        int[] diff = new int[s.length()];

        for (int i = 0; i < diff.length; i++)
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));

        int maxLength = 0, totalCost = 0, left = 0, right = 0;

        while (right < diff.length) {
            if (totalCost <= maxCost) {
                maxLength = Math.max(maxLength, right - left);
                totalCost += diff[right++];
            }

            else if (totalCost > maxCost)
                totalCost -= diff[left++];
        }

        if (totalCost <= maxCost)
            maxLength = Math.max(maxLength, right - left);

        return maxLength;
    }
}