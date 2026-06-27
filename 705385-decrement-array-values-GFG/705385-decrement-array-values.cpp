class Solution {
	public:
	int* decrementArrayElements(int arr[], int size) {
		// Code here
		for (int i = 0; i < size; i++) {
			
			arr[i] = arr[i] - 1;
			
		}
		
		return arr;
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna