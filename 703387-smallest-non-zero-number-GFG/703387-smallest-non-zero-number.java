class Solution {
	public int find(int[] arr) {
		long need = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			need = (need + arr[i] + 1) / 2;
		}
		return (int) need;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna