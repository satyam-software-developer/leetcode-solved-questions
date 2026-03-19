class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] x = new int[m + 1][n + 1];
        int[][] y = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                x[i][j] = x[i - 1][j] + x[i][j - 1] - x[i - 1][j - 1];
                y[i][j] = y[i - 1][j] + y[i][j - 1] - y[i - 1][j - 1];
                if (grid[i - 1][j - 1] == 'X') x[i][j]++;
                if (grid[i - 1][j - 1] == 'Y') y[i][j]++;
            }
        }

        int count = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                int cx = x[i][j];
                int cy = y[i][j];
                if (cx > 0 && cx == cy) count++;
            }
        }

        return count;
    }
}