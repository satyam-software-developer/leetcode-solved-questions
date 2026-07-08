import java.util.*;

class Solution {
	public int countCoordinates(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		
		boolean[][] p = new boolean[n][m];
		boolean[][] q = new boolean[n][m];
		
		Queue<int[]> queue = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			if (!p[i][0]) {
				p[i][0] = true;
				queue.offer(new int[] {i, 0});
			}
		}
		for (int j = 0; j < m; j++) {
			if (!p[0][j]) {
				p[0][j] = true;
				queue.offer(new int[] {0, j});
			}
		}
		bfs(mat, p, queue);
		
		queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if (!q[i][m - 1]) {
				q[i][m - 1] = true;
				queue.offer(new int[] {i, m - 1});
			}
		}
		for (int j = 0; j < m; j++) {
			if (!q[n - 1][j]) {
				q[n - 1][j] = true;
				queue.offer(new int[] {n - 1, j});
			}
		}
		bfs(mat, q, queue);
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (p[i][j] && q[i][j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	private void bfs(int[][] mat, boolean[][] vis, Queue<int[]> queue) {
		int n = mat.length;
		int m = mat[0].length;
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		while (!queue.isEmpty()) {
			int[] cur = queue.poll();
			int r = cur[0], c = cur[1];
			
			for (int k = 0; k < 4; k++) {
				int nr = r + dr[k];
				int nc = c + dc[k];
				
				if (nr >= 0 && nr < n && nc >= 0 && nc < m &&
				!vis[nr][nc] &&
				mat[nr][nc] >= mat[r][c]) {
					vis[nr][nc] = true;
					queue.offer(new int[] {nr, nc});
				}
			}
		}
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna