class Solution {
	public int maxDotProduct(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;
		
		int[][] dp = new int[m + 1][n + 1];
		
		for (int i = 1; i <= m; i++) {
			dp[i][0] = Integer.MIN_VALUE;
		}
		
		for (int i = 1; i <= m; i++) {
			for (int j = i; j <= n; j++) {
				int take = dp[i - 1][j - 1];
				if (take != Integer.MIN_VALUE) {
					take += a[j - 1] * b[i - 1];
				}
				int skip = dp[i][j - 1];
				dp[i][j] = Math.max(take, skip);
			}
		}
		
		return dp[m][n];
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna