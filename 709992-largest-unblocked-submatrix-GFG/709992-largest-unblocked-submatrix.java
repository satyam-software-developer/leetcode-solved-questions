import java.util.Arrays;

class Solution {
	public int largestArea(int n, int m, int[][] arr) {
		int k = arr.length;
		int[] rows = new int[k + 2];
		int[] cols = new int[k + 2];
		
		rows[0] = 0;
		cols[0] = 0;
		
		for (int i = 0; i < k; i++) {
			rows[i + 1] = arr[i][0];
			cols[i + 1] = arr[i][1];
		}
		
		rows[k + 1] = n + 1;
		cols[k + 1] = m + 1;
		
		Arrays.sort(rows);
		Arrays.sort(cols);
		
		int maxRow = 0;
		int maxCol = 0;
		
		for (int i = 1; i < rows.length; i++) {
			maxRow = Math.max(maxRow, rows[i] - rows[i - 1] - 1);
		}
		
		for (int i = 1; i < cols.length; i++) {
			maxCol = Math.max(maxCol, cols[i] - cols[i - 1] - 1);
		}
		
		return maxRow * maxCol;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna