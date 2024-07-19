package Easy;

/**
 * <a href="https://leetcode.com/problems/crawler-log-folder/">Crawler Log Folder</a>
 */
public class _1598_
{
    /**
     * Calculates the minimum number of operations needed to go back to the main
     * folder after the change folder operations.
     * 
     * @param logs String array log of change folder operations.
     * @return Minimum number of operations needed to go back to the main folder after the change folder operations. 
     */
    public int minOperations(String[] logs) {
        int result = 0;

        for (String log : logs) {
            if (log.equals("../"))
                result = result == 0 ? 0 : result - 1;

            else if (log.charAt(0) != '.')
                result++;
        }

        return result;
    }
}