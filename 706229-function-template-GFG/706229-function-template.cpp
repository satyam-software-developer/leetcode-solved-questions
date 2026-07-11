template <class T>
T largest(T arr[], int n) {
	
	// code here
	T max = arr[0];
	
	for (int i = 1; i < n; i++) {
		if (arr[i] > max) {
			max = arr[i];
		}
	}
	return max;
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna