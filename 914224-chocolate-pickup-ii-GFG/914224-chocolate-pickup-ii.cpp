class Solution {
  public:
    int chocolatePickup(vector<vector<int>> &mat) {
        int n = mat.size();
        vector<vector<vector<int>>> dp(n, vector<vector<int>>(n, vector<int>(n, -1)));
        int result = helper(0, 0, 0, mat, dp, n);
        return max(0, result);
    }

  private:
    int helper(int r1, int c1, int c2, vector<vector<int>> &mat, vector<vector<vector<int>>> &dp, int n) {
        int r2 = r1 + c1 - c2;
        if (r1 >= n || c1 >= n || r2 >= n || c2 >= n || mat[r1][c1] == -1 || mat[r2][c2] == -1)
            return INT_MIN;
        if (r1 == n - 1 && c1 == n - 1)
            return mat[r1][c1];
        if (dp[r1][c1][c2] != -1)
            return dp[r1][c1][c2];

        int chocolates = mat[r1][c1];
        if (r1 != r2 || c1 != c2)
            chocolates += mat[r2][c2];

        int maxNext = max(
            max(helper(r1 + 1, c1, c2, mat, dp, n), helper(r1, c1 + 1, c2, mat, dp, n)),
            max(helper(r1 + 1, c1, c2 + 1, mat, dp, n), helper(r1, c1 + 1, c2 + 1, mat, dp, n))
        );

        chocolates += maxNext;
        return dp[r1][c1][c2] = chocolates;
    }
};
