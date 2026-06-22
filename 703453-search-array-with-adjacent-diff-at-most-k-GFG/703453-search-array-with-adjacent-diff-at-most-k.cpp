// x is the element to be searched in arr[0..n-1]
// such that all elements differ by at-most k.

class Solution {
	public:
	int findStepKeyIndex(vector<int>& arr, int k, int x) {
		// code here
		int i = 0;
		
		while (i < arr.size()) {
			if (arr[i] == x) {
				return i;
			}
			
			i += max(1, abs(arr[i] - x) / k);
		}
		
		return - 1;
	}
	
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna