class Solution {
	public:
	int getMaxVal(vector<int> &arr, int k) {
		priority_queue<int, vector<int>, greater<int>> pq;
		
		for (int num : arr) {
			pq.push(num);
			
			if (pq.size() > k) {
				pq.pop();
			}
		}
		
		int sum = 0;
		
		while (!pq.empty()) {
			sum += pq.top();
			pq.pop();
		}
		
		return sum;
	}
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna