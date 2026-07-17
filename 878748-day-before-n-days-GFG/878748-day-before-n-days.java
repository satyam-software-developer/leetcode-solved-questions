class Solution {
    public int dayBefore(int d, int n) {
        // code here
         return (d - (n % 7) + 7) % 7;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna