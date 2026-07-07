class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) {
            return 0;
        }

        String s = String.valueOf(n);
        long x = 0;
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '0') {
                int digit = ch - '0';
                x = x * 10 + digit;
                sum += digit;
            }
        }

        return x * sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna