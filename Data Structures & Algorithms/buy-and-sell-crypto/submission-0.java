class Solution {
    public int maxProfit(int[] prices) 
    {
        int bestProfit = 0;
        int lowestPrice = prices[0];
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < lowestPrice)
            {
                lowestPrice = prices[i];
            }
            if (prices[i] - lowestPrice > bestProfit)
            {
                bestProfit = prices[i] - lowestPrice;
            }
        } 
        return bestProfit;
    }
}
