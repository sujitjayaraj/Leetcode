package Easy;

/**
 * <a href="https://leetcode.com/problems/score-of-a-string/">Score of a String</a>
 */
public class _3110_
{
    /**
     * Calculates the absolute difference in ASCII values between the adjacent characters of a {@link String}.
     * 
     * @param s An input {@link String}.
     * @return Score of the input {@link String}.
     */
    public int scoreOfString(String s) {
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++)
            sum += Math.abs(s.charAt(i) - s.charAt(i + 1));

        return sum;
    }
}