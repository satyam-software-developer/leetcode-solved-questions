class Solution {
    public int optimalKeys(int n) {
        if (n <= 6) {
            return n;
        }

        int[] dp = new int[n + 1];

        for (int i = 1; i <= 6; i++) {
            dp[i] = i;
        }

        for (int i = 7; i <= n; i++) {
            dp[i] = 0;

            for (int j = i - 3; j >= 1; j--) {
                dp[i] = Math.max(dp[i], dp[j] * (i - j - 1));
            }
        }

        return dp[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna