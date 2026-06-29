// User function Template for Java

// User function Template for Java

// User function Template for Java

class Complete {
	
	// Function for finding maximum and value pair
	public static int[] greaterElement(int arr[], int n) {
		// Complete the function
		TreeSet<Integer> set = new TreeSet<>();
		
		for (int num : arr) {
			set.add(num);
		}
		
		int[] ans = new int[n];
		
		for (int i = 0; i < n; i++) {
			Integer next = set.higher(arr[i]);
			ans[i] = (next == null) ? -10000000 : next;
		}
		
		return ans;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna