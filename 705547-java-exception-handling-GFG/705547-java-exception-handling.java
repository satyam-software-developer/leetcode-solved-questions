class Solution {
    public int findMin(int a, int b) {
        // code here
         int ans = Math.min(a + b, Math.min(a - b, a * b));

        try {
            ans = Math.min(ans, a / b);
        } catch (ArithmeticException e) {
        }

        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna