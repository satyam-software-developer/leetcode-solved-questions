class Solution {
    public int minCost(int keys[], int freq[]) {
        int n = keys.length;
        int[][] dp = new int[n][n];
        int[] prefix = new int[n + 1];
        
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + freq[i];
        
        for (int g = 0; g < n; g++) {
            for (int i = 0, j = g; j < n; i++, j++) {
                if (g == 0) {
                    dp[i][j] = freq[i];
                } else {
                    int sum = prefix[j + 1] - prefix[i];
                    int min = Integer.MAX_VALUE;
                    for (int r = i; r <= j; r++) {
                        int left = r == i ? 0 : dp[i][r - 1];
                        int right = r == j ? 0 : dp[r + 1][j];
                        min = Math.min(min, left + right + sum);
                    }
                    dp[i][j] = min;
                }
            }
        }
        return dp[0][n - 1];
    }
}
