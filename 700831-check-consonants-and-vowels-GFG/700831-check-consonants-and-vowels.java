class Solution {
	
	static void checkString(String s) {
		int v = 0;
		int c = 0;
		
		// code here
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;
			} else {
				c++;
			}
		}
		
		if (v > c) {
			System.out.println("Yes");
		} else if (v < c) {
			System.out.println("No");
		} else {
			System.out.println("Same");
		}
	}
}




// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna