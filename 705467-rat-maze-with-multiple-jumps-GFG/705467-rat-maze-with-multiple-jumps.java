class Solution {
    private int[][] dp;

    private boolean withinMatrix(int i, int j, int[][] mat) {
        if (i >= mat.length || j >= mat[0].length || mat[i][j] == 0) {
            return false;
        }
        return true;
    }

    private boolean ratMaze(int[][] mat, int[][] ans, int i, int j) {
        if (!withinMatrix(i, j, mat)) {
            return false;
        }

        if (i == mat.length - 1 && j == mat[0].length - 1) {
            ans[i][j] = 1;
            return true;
        }

        if (dp[i][j] == 0) {
            return false;
        }

        ans[i][j] = 1;

        for (int jump = 1; jump <= mat[i][j]; jump++) {
            if (ratMaze(mat, ans, i, j + jump)) {
                return true;
            }

            if (ratMaze(mat, ans, i + jump, j)) {
                return true;
            }
        }

        ans[i][j] = 0;
        dp[i][j] = 0;

        return false;
    }

    public ArrayList<ArrayList<Integer>> shortestDist(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] ans = new int[n][m];
        dp = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        if (!ratMaze(mat, ans, 0, 0)) {
            ArrayList<ArrayList<Integer>> res = new ArrayList<>();
            ArrayList<Integer> row = new ArrayList<>();
            row.add(-1);
            res.add(row);
            return res;
        }

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(ans[i][j]);
            }
            res.add(row);
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna