class Solution {
    static final int MOD = 1000000007;

    public int numberOfStableArrays(int zero, int one, int limit) {
        long[][][] dp = new long[zero + 1][one + 1][2];

        for (int i = 1; i <= Math.min(zero, limit); i++) dp[i][0][0] = 1;
        for (int j = 1; j <= Math.min(one, limit); j++) dp[0][j][1] = 1;

        for (int i = 0; i <= zero; i++) {
            for (int j = 0; j <= one; j++) {
                if (i > 0) {
                    long sum = 0;
                    for (int k = 1; k <= limit && i - k >= 0; k++) {
                        sum = (sum + dp[i - k][j][1]) % MOD;
                    }
                    dp[i][j][0] = (dp[i][j][0] + sum) % MOD;
                }

                if (j > 0) {
                    long sum = 0;
                    for (int k = 1; k <= limit && j - k >= 0; k++) {
                        sum = (sum + dp[i][j - k][0]) % MOD;
                    }
                    dp[i][j][1] = (dp[i][j][1] + sum) % MOD;
                }
            }
        }

        return (int)((dp[zero][one][0] + dp[zero][one][1]) % MOD);
    }
}