class Solution {
	int ans;
	int[] dx = {-1, 1, 0, 0};
	int[] dy = {0, 0, -1, 1};
	
	public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
		int n = mat.length;
		int m = mat[0].length;
		
		if (mat[xs][ys] == 0 || mat[xd][yd] == 0)
			return - 1;
		
		ans = -1;
		boolean[][] vis = new boolean[n][m];
		dfs(mat, xs, ys, xd, yd, vis, 0);
		return ans;
	}
	
	private void dfs(int[][] mat, int x, int y, int xd, int yd, boolean[][] vis, int len) {
		if (x == xd && y == yd) {
			ans = Math.max(ans, len);
			return;
		}
		
		vis[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < mat.length && ny < mat[0].length
			 && mat[nx][ny] == 1 && !vis[nx][ny]) {
				dfs(mat, nx, ny, xd, yd, vis, len + 1);
			}
		}
		
		vis[x][y] = false;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna