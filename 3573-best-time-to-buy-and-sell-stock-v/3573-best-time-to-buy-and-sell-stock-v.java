import java.util.*;

class Solution {
    public long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        long neg = Long.MIN_VALUE / 4;
        long[][] dp = new long[k + 1][3];
        for (int i = 0; i <= k; i++) Arrays.fill(dp[i], neg);
        dp[0][0] = 0;

        for (int price : prices) {
            long[][] ndp = new long[k + 1][3];
            for (int i = 0; i <= k; i++) Arrays.fill(ndp[i], neg);

            for (int t = 0; t <= k; t++) {
                if (dp[t][0] != neg) {
                    ndp[t][0] = Math.max(ndp[t][0], dp[t][0]);
                    ndp[t][1] = Math.max(ndp[t][1], dp[t][0] - price);
                    ndp[t][2] = Math.max(ndp[t][2], dp[t][0] + price);
                }
                if (dp[t][1] != neg) {
                    ndp[t][1] = Math.max(ndp[t][1], dp[t][1]);
                    if (t + 1 <= k) ndp[t + 1][0] = Math.max(ndp[t + 1][0], dp[t][1] + price);
                }
                if (dp[t][2] != neg) {
                    ndp[t][2] = Math.max(ndp[t][2], dp[t][2]);
                    if (t + 1 <= k) ndp[t + 1][0] = Math.max(ndp[t + 1][0], dp[t][2] - price);
                }
            }
            dp = ndp;
        }

        long ans = 0;
        for (int t = 0; t <= k; t++) ans = Math.max(ans, dp[t][0]);
        return ans;
    }
}
