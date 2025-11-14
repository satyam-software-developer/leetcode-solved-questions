class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] diff = new int[n + 1][n + 1];
        for (int[] q : queries) {
            int r1 = q[0], c1 = q[1], r2 = q[2], c2 = q[3];
            diff[r1][c1] += 1;
            diff[r1][c2 + 1] -= 1;
            diff[r2 + 1][c1] -= 1;
            diff[r2 + 1][c2 + 1] += 1;
        }
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = 0; j < n; j++) {
                cur += diff[i][j];
                res[i][j] = cur;
            }
        }
        for (int j = 0; j < n; j++) {
            int cur = 0;
            for (int i = 0; i < n; i++) {
                cur += res[i][j];
                res[i][j] = cur;
            }
        }
        return res;
    }
}
