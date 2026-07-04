class Solution {
	public int hopscotch(int[][] mat, int d, int i, int j) {
		
		int n = mat.length;
		int m = mat[0].length;
		int res = 0;
		
		if (d == 0) {
			
			if ((j + 1) % 2 == 0) {
				
				if (isValid(i, j - 1, n, m))
					res += mat[i][j - 1];
				if (isValid(i, j + 1, n, m))
					res += mat[i][j + 1];
				if (isValid(i - 1, j, n, m))
					res += mat[i - 1][j];
				if (isValid(i + 1, j, n, m))
					res += mat[i + 1][j];
				if (isValid(i + 1, j - 1, n, m))
					res += mat[i + 1][j - 1];
				if (isValid(i + 1, j + 1, n, m))
					res += mat[i + 1][j + 1];
				
			} else {
				
				if (isValid(i, j - 1, n, m))
					res += mat[i][j - 1];
				if (isValid(i, j + 1, n, m))
					res += mat[i][j + 1];
				if (isValid(i - 1, j, n, m))
					res += mat[i - 1][j];
				if (isValid(i + 1, j, n, m))
					res += mat[i + 1][j];
				if (isValid(i - 1, j + 1, n, m))
					res += mat[i - 1][j + 1];
				if (isValid(i - 1, j - 1, n, m))
					res += mat[i - 1][j - 1];
			}
			
		} else {
			
			if ((j + 1) % 2 == 0) {
				
				if (isValid(i - 1, j - 1, n, m))
					res += mat[i - 1][j - 1];
				if (isValid(i - 2, j, n, m))
					res += mat[i - 2][j];
				if (isValid(i - 1, j + 1, n, m))
					res += mat[i - 1][j + 1];
				if (isValid(i - 1, j + 2, n, m))
					res += mat[i - 1][j + 2];
				if (isValid(i, j + 2, n, m))
					res += mat[i][j + 2];
				if (isValid(i + 1, j + 2, n, m))
					res += mat[i + 1][j + 2];
				if (isValid(i + 2, j + 1, n, m))
					res += mat[i + 2][j + 1];
				if (isValid(i + 2, j, n, m))
					res += mat[i + 2][j];
				if (isValid(i + 2, j - 1, n, m))
					res += mat[i + 2][j - 1];
				if (isValid(i + 1, j - 2, n, m))
					res += mat[i + 1][j - 2];
				if (isValid(i, j - 2, n, m))
					res += mat[i][j - 2];
				if (isValid(i - 1, j - 2, n, m))
					res += mat[i - 1][j - 2];
				
			} else {
				
				if (isValid(i - 2, j - 1, n, m))
					res += mat[i - 2][j - 1];
				if (isValid(i - 2, j, n, m))
					res += mat[i - 2][j];
				if (isValid(i - 2, j + 1, n, m))
					res += mat[i - 2][j + 1];
				if (isValid(i - 1, j + 2, n, m))
					res += mat[i - 1][j + 2];
				if (isValid(i, j + 2, n, m))
					res += mat[i][j + 2];
				if (isValid(i + 1, j + 2, n, m))
					res += mat[i + 1][j + 2];
				if (isValid(i + 1, j + 1, n, m))
					res += mat[i + 1][j + 1];
				if (isValid(i + 2, j, n, m))
					res += mat[i + 2][j];
				if (isValid(i + 1, j - 1, n, m))
					res += mat[i + 1][j - 1];
				if (isValid(i + 1, j - 2, n, m))
					res += mat[i + 1][j - 2];
				if (isValid(i, j - 2, n, m))
					res += mat[i][j - 2];
				if (isValid(i - 1, j - 2, n, m))
					res += mat[i - 1][j - 2];
			}
		}
		
		return res;
	}
	
	private boolean isValid(int i, int j, int n, int m) {
		return i >= 0 && i < n && j >= 0 && j < m;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna