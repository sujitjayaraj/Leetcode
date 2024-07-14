package Easy;

/**
 * Question 1518
 * <a href="https://leetcode.com/problems/water-bottles/">Water Bottles</a>
 */

public class _1518_
{
    public int numWaterBottles(int numBottles, int numExchange) {
        int full = 0, empty = numBottles, result = empty;

        while (empty >= numExchange) {
            full = empty / numExchange;
            empty = (empty % numExchange) + full;
            result += full;
        }

        return result;
    }
}