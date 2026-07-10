class Solution {
	public:
	void sortInDesc(vector<int>& arr) {
		// code here
		sort(arr.begin(), arr.end(), greater<int>());
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna