class Solution {
    int distinctSubseq(String str) {
        int MOD = 1000000007;
        int n = str.length();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        long[] last = new long[26];

        for (int i = 1; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) % MOD;
            int idx = str.charAt(i - 1) - 'a';
            dp[i] = (dp[i] - last[idx] + MOD) % MOD;
            last[idx] = dp[i - 1];
        }

        return (int) dp[n];
    }
}
