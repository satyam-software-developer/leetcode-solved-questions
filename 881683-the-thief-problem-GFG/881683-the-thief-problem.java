class Solution {
	public int getMaxVal(List<Integer> arr, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for (int num : arr) {
			pq.offer(num);
			
			if (pq.size() > k) {
				pq.poll();
			}
		}
		
		int sum = 0;
		
		while (!pq.isEmpty()) {
			sum += pq.poll();
		}
		
		return sum;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna