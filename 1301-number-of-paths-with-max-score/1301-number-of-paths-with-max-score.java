class Solution {
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        int mod = 1000000007;
        int[][] dp = new int[n][n];
        int[][] ways = new int[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        dp[n - 1][n - 1] = 0;
        ways[n - 1][n - 1] = 1;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (board.get(i).charAt(j) == 'X' || (i == n - 1 && j == n - 1)) {
                    continue;
                }

                int best = -1;
                int count = 0;

                if (i + 1 < n && dp[i + 1][j] != -1) {
                    best = dp[i + 1][j];
                    count = ways[i + 1][j];
                }

                if (j + 1 < n && dp[i][j + 1] != -1) {
                    if (dp[i][j + 1] > best) {
                        best = dp[i][j + 1];
                        count = ways[i][j + 1];
                    } else if (dp[i][j + 1] == best) {
                        count = (count + ways[i][j + 1]) % mod;
                    }
                }

                if (i + 1 < n && j + 1 < n && dp[i + 1][j + 1] != -1) {
                    if (dp[i + 1][j + 1] > best) {
                        best = dp[i + 1][j + 1];
                        count = ways[i + 1][j + 1];
                    } else if (dp[i + 1][j + 1] == best) {
                        count = (count + ways[i + 1][j + 1]) % mod;
                    }
                }

                if (best == -1) {
                    continue;
                }

                char c = board.get(i).charAt(j);
                int val = (c >= '1' && c <= '9') ? c - '0' : 0;
                dp[i][j] = best + val;
                ways[i][j] = count;
            }
        }

        if (dp[0][0] == -1) {
            return new int[] { 0, 0 };
        }

        return new int[] { dp[0][0], ways[0][0] };
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna