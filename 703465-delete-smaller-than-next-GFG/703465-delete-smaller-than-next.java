class Solution {
	public static ArrayList<Integer> deleteElement(int arr[], int k) {
		// Code here
		ArrayList<Integer> st = new ArrayList<>();
		
		for (int num : arr) {
			while (!st.isEmpty() && k > 0 && st.get(st.size() - 1) < num) {
				st.remove(st.size() - 1);
				k--;
			}
			st.add(num);
		}
		
		return st;
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna