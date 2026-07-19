/*
The interface looks like

interface Add {
    public int addParameters(int a, int b);
}
*/

class Solution {
    public static Add helperFunction() {
        // Your code here
        return (a, b) -> a + b;

        // Implement the addParameters method that returns a+b.
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna