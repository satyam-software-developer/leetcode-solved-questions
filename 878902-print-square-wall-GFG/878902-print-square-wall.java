import java.util.Scanner;

class GFG {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// code here
		String row = "* ".repeat(n).trim();
		
		for (int i = 0; i < n; i++) {
			System.out.println(row);
		}
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna