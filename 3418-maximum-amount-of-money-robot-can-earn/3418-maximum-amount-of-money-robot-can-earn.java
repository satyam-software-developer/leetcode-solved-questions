class Solution {
    public int maximumAmount(int[][] coins) {
        int m = coins.length, n = coins[0].length;
        int[][][] dp = new int[m][n][3];
        int neg = Integer.MIN_VALUE / 2;

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < 3; k++)
                    dp[i][j][k] = neg;

        for (int k = 0; k < 3; k++) {
            if (coins[0][0] >= 0) dp[0][0][k] = coins[0][0];
            else {
                dp[0][0][k] = coins[0][0];
                if (k > 0) dp[0][0][k] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i == 0 && j == 0) continue;

                    int val = coins[i][j];
                    int best = neg;

                    if (i > 0) {
                        best = Math.max(best, dp[i - 1][j][k]);
                        if (val < 0 && k > 0) best = Math.max(best, dp[i - 1][j][k - 1]);
                    }
                    if (j > 0) {
                        best = Math.max(best, dp[i][j - 1][k]);
                        if (val < 0 && k > 0) best = Math.max(best, dp[i][j - 1][k - 1]);
                    }

                    if (best == neg) continue;

                    if (val >= 0) dp[i][j][k] = best + val;
                    else {
                        dp[i][j][k] = best + val;
                        if (k > 0) {
                            int prev = neg;
                            if (i > 0) prev = Math.max(prev, dp[i - 1][j][k - 1]);
                            if (j > 0) prev = Math.max(prev, dp[i][j - 1][k - 1]);
                            dp[i][j][k] = Math.max(dp[i][j][k], prev);
                        }
                    }
                }
            }
        }

        return Math.max(dp[m - 1][n - 1][0], Math.max(dp[m - 1][n - 1][1], dp[m - 1][n - 1][2]));
    }
}