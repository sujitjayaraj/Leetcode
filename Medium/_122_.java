package Medium;

// Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class _122_
{
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++)
            if(prices[i] > prices[i-1])
                maxProfit += prices[i] - prices[i-1];
        
        return maxProfit;
    }
}