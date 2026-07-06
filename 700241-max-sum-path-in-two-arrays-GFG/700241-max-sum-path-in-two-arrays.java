class Solution {
	public int maxPathSum(int[] a, int[] b) {
		int i = 0, j = 0;
		long sum1 = 0, sum2 = 0, result = 0;
		
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				sum1 += a[i++];
			} else if (a[i] > b[j]) {
				sum2 += b[j++];
			} else {
				result += Math.max(sum1, sum2) + a[i];
				sum1 = 0;
				sum2 = 0;
				i++;
				j++;
			}
		}
		
		while (i < a.length) {
			sum1 += a[i++];
		}
		
		while (j < b.length) {
			sum2 += b[j++];
		}
		
		result += Math.max(sum1, sum2);
		
		return (int) result;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna