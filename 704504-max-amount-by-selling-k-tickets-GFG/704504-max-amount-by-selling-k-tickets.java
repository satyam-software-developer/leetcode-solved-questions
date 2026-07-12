class Solution {
	static final int MOD = 1000000007;
	
	public int maxAmount(int[] arr, int k) {
		java.util.PriorityQueue<Long> pq = new java.util.PriorityQueue<>(java.util.Collections.reverseOrder());
		
		for (int x : arr) {
			pq.offer((long) x);
		}
		
		long ans = 0;
		
		while (k > 0 && !pq.isEmpty()) {
			long curr = pq.poll();
			ans = (ans + curr) % MOD;
			if (curr > 1) {
				pq.offer(curr - 1);
			}
			k--;
		}
		
		return (int) ans;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna