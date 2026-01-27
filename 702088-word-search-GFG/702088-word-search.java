class Solution {
    public boolean isWordExist(char[][] mat, String word) {
        int n = mat.length;
        int m = mat[0].length;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(mat, word, 0, i, j, vis)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] mat, String word, int idx, int i, int j, boolean[][] vis) {
        if (idx == word.length()) return true;
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length) return false;
        if (vis[i][j] || mat[i][j] != word.charAt(idx)) return false;

        vis[i][j] = true;

        boolean found =
                dfs(mat, word, idx + 1, i + 1, j, vis) ||
                dfs(mat, word, idx + 1, i - 1, j, vis) ||
                dfs(mat, word, idx + 1, i, j + 1, vis) ||
                dfs(mat, word, idx + 1, i, j - 1, vis);

        vis[i][j] = false;
        return found;
    }
}
