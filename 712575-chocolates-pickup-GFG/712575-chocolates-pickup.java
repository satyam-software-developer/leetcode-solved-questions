import java.util.*;

class Solution {
    public int maxChocolate(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][][] dp = new int[n][m][m];
        for (int[][] a : dp) for (int[] b : a) Arrays.fill(b, -1);

        return dfs(0, 0, m - 1, grid, dp);
    }

    int dfs(int i, int j1, int j2, int[][] grid, int[][][] dp) {
        int n = grid.length, m = grid[0].length;

        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) return Integer.MIN_VALUE;

        if (i == n - 1) {
            if (j1 == j2) return grid[i][j1];
            return grid[i][j1] + grid[i][j2];
        }

        if (dp[i][j1][j2] != -1) return dp[i][j1][j2];

        int ans = 0;
        for (int d1 = -1; d1 <= 1; d1++) {
            for (int d2 = -1; d2 <= 1; d2++) {
                int val;
                if (j1 == j2) val = grid[i][j1];
                else val = grid[i][j1] + grid[i][j2];
                val += dfs(i + 1, j1 + d1, j2 + d2, grid, dp);
                ans = Math.max(ans, val);
            }
        }

        return dp[i][j1][j2] = ans;
    }
}