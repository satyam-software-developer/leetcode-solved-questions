class Solution {
    public int chocolatePickup(int[][] mat) {
        int n = mat.length;
        int[][][] dp = new int[n][n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    dp[i][j][k] = -1;
        int result = helper(0, 0, 0, mat, dp, n);
        return Math.max(0, result);
    }

    private int helper(int r1, int c1, int c2, int[][] mat, int[][][] dp, int n) {
        int r2 = r1 + c1 - c2;
        if (r1 >= n || c1 >= n || r2 >= n || c2 >= n || mat[r1][c1] == -1 || mat[r2][c2] == -1)
            return Integer.MIN_VALUE;
        if (r1 == n - 1 && c1 == n - 1)
            return mat[r1][c1];
        if (dp[r1][c1][c2] != -1)
            return dp[r1][c1][c2];
        int chocolates = mat[r1][c1];
        if (r1 != r2 || c1 != c2)
            chocolates += mat[r2][c2];
        int maxNext = Math.max(
            Math.max(helper(r1 + 1, c1, c2, mat, dp, n), helper(r1, c1 + 1, c2, mat, dp, n)),
            Math.max(helper(r1 + 1, c1, c2 + 1, mat, dp, n), helper(r1, c1 + 1, c2 + 1, mat, dp, n))
        );
        chocolates += maxNext;
        dp[r1][c1][c2] = chocolates;
        return chocolates;
    }
}
