
class Solution {
    public int maximumAmount(int arr[]) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        
        for (int len = 1; len <= n; len++) {
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                if (i == j) {
                    dp[i][j] = arr[i];
                } else {
                    int takeFirst = arr[i] + (i + 2 <= j ? Math.min(dp[i+2][j], dp[i+1][j-1]) : 0);
                    int takeLast = arr[j] + (i <= j - 2 ? Math.min(dp[i+1][j-1], dp[i][j-2]) : 0);
                    dp[i][j] = Math.max(takeFirst, takeLast);
                }
            }
        }
        return dp[0][n-1];
    }
}
