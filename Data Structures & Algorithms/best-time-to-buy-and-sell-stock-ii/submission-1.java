class Solution {

    private int maxProfit(int index, int buy, int[] prices, int n, int[][] dp) {
        if(index == n)
            return 0;

        if(dp[index][buy] != -1)
            return dp[index][buy];

        int profit = 0;

        if(buy != 0)
            profit = Math.max(
                -prices[index] + maxProfit(index + 1, 0, prices, n, dp),
                0 + maxProfit(index + 1, 1, prices, n, dp)
            );

        else 
            profit = Math.max(
                prices[index] + maxProfit(index + 1, 1, prices, n, dp),
                0 + maxProfit(index + 1, 0, prices, n, dp)
            );

        return dp[index][buy] = profit;
    }

    private int maxProfit(int index, int buy, int[] prices, int n) {
        if(index == n)
            return 0;

        int profit = 0;

        if(buy != 0)
            profit = Math.max(
                -prices[index] + maxProfit(index + 1, 0, prices, n),
                0 + maxProfit(index + 1, 1, prices, n)
            );

        else 
            profit = Math.max(
                prices[index] + maxProfit(index + 1, 1, prices, n),
                0 + maxProfit(index + 1, 0, prices, n)
            );

        return profit;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][] dp = new int[n][2];

        for(int[] row : dp)
            Arrays.fill(row, -1);

        return maxProfit(0, 1, prices, n, dp);
    }
}