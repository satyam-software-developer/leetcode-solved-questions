class Solution {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    int cntOnes(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 1 && !visited[i][0]) {
                dfs(grid, visited, i, 0);
            }

            if (grid[i][m - 1] == 1 && !visited[i][m - 1]) {
                dfs(grid, visited, i, m - 1);
            }
        }

        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 1 && !visited[0][j]) {
                dfs(grid, visited, 0, j);
            }

            if (grid[n - 1][j] == 1 && !visited[n - 1][j]) {
                dfs(grid, visited, n - 1, j);
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    void dfs(int[][] grid, boolean[][] visited, int x, int y) {
        int n = grid.length;
        int m = grid[0].length;

        visited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx >= 0 && ny >= 0 && nx < n && ny < m &&
                grid[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(grid, visited, nx, ny);
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna