import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        // code here
        int p = x + y;
        int q = x - y;
        int r = x * y;
        int s = x / y;
        int t = x % y;

        // The below code prints the output
        System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna