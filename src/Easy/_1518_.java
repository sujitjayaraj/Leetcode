package Easy;

/**
 * <a href="https://leetcode.com/problems/water-bottles/">Water Bottles</a>
 */
public class _1518_
{
    /**
     * Calculates the maximum number of water bottles you can drink.
     * 
     * @param numBottles Number of water bottles that are initially full of water.
     * @param numExchange Number of empty water bottles that can be exchanged with one full
     * water bottle from the market.
     */
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