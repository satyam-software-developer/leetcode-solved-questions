import java.math.BigInteger;

class Solution {
    static BigInteger fib(int n) {
        if (n == 1 || n == 2) {
            return BigInteger.ONE;
        }

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }

        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna