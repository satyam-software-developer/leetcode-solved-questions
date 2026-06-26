class Solution {
	public:
	vector<int> matrixSum(int n, int m, vector<vector<int>> mat, int q,
	vector<int> queries[]) {
		// code here
		
		vector<int> ans;
		
		// 8 directions for 1-hop
		int dx[8] = {-1, -1, -1, 0, 0, 1, 1, 1};
		int dy[8] = {-1, 0, 1, -1, 1, -1, 0, 1};
		
		for (int k = 0; k < q; k++) {
			
			int type = queries[k][0];
			int r = queries[k][1];
			int c = queries[k][2];
			
			int sum = 0;
			
			// Type 1 Query (1-hop)
			if (type == 1) {
				
				for (int i = 0; i < 8; i++) {
					int nr = r + dx[i];
					int nc = c + dy[i];
					
					if (nr >= 0 && nr < n && nc >= 0 && nc < m)
						sum += mat[nr][nc];
				}
			}
			
			// Type 2 Query (2-hop)
			else {
				
				// Top row
				for (int j = c - 2; j <= c + 2; j++) {
					if (r - 2 >= 0 && j >= 0 && j < m)
						sum += mat[r - 2][j];
				}
				
				// Bottom row
				for (int j = c - 2; j <= c + 2; j++) {
					if (r + 2 < n && j >= 0 && j < m)
						sum += mat[r + 2][j];
				}
				
				// Left column (excluding corners)
				for (int i = r - 1; i <= r + 1; i++) {
					if (i >= 0 && i < n && c - 2 >= 0)
						sum += mat[i][c - 2];
				}
				
				// Right column (excluding corners)
				for (int i = r - 1; i <= r + 1; i++) {
					if (i >= 0 && i < n && c + 2 < m)
						sum += mat[i][c + 2];
				}
			}
			
			ans.push_back(sum);
		}
		
		return ans;
		
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna