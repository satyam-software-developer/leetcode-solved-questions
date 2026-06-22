class Solution {
	public int findStepKeyIndex(int[] arr, int k, int x) {
		// code here
		int i = 0;
		
		while (i < arr.length) {
			if (arr[i] == x) {
				return i;
			}
			
			i += Math.max(1, Math.abs(arr[i] - x)/k);
		}
		
		return - 1;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna