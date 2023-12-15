class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxTransactions = 2;
        int[][][] dp = new int[prices.length][maxTransactions + 1][2];

        for (int transaction = 1; transaction <= maxTransactions; transaction++) {
            dp[0][transaction][1] = -prices[0];
        }

        for (int day = 1; day < prices.length; day++) {
            for (int transaction = 1; transaction <= maxTransactions; transaction++) {
                dp[day][transaction][1] = Math.max(dp[day - 1][transaction][1], dp[day - 1][transaction - 1][0] - prices[day]);
                dp[day][transaction][0] = Math.max(dp[day - 1][transaction][0], dp[day - 1][transaction][1] + prices[day]);
            }
        }

        int maxProfit = 0;
        for (int transaction = 0; transaction <= maxTransactions; transaction++) {
            maxProfit = Math.max(maxProfit, dp[prices.length - 1][transaction][0]);
        }

        return maxProfit;
    }
}
