package Easy;

/**
 * <a href="https://leetcode.com/problems/number-of-senior-citizens/">Number of Senior Citizens</a>
 */
public class _2678_
{
    /**
     * Calculates the number of passengers who are strictly above 60 years old.
     * 
     * @param details Array of {@link String} containing details of the passengers.
     * @return Number of passengers who are strictly above 60 years old.
     */
    public int countSeniors(String[] details) {
        int result = 0;

        for (String s : details) {
            int age = (s.charAt(11) - 48) * 10 + (s.charAt(12) - 48);

            if (age > 60)
                result++;
        }

        return result;
    }
}