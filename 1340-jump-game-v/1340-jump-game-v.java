class Solution {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] dp = new int[n];
        int ans = 1;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, dfs(arr, d, i, dp));
        }

        return ans;
    }

    private int dfs(int[] arr, int d, int index, int[] dp) {
        if (dp[index] != 0) {
            return dp[index];
        }

        int max = 1;

        for (int i = index - 1; i >= Math.max(0, index - d); i--) {
            if (arr[i] >= arr[index]) {
                break;
            }

            max = Math.max(max, 1 + dfs(arr, d, i, dp));
        }

        for (int i = index + 1; i <= Math.min(arr.length - 1, index + d); i++) {
            if (arr[i] >= arr[index]) {
                break;
            }

            max = Math.max(max, 1 + dfs(arr, d, i, dp));
        }

        dp[index] = max;
        return max;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna