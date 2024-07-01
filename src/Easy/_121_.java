package Easy;

// Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class _121_
{
    public int maxProfit(int[] prices) {
        int maxProfit = 0, minPrice = prices[0];

        for(int price: prices){
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}