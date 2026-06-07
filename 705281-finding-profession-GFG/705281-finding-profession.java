class Solution {
    public String profession(int level, int pos) {
        int flips = Integer.bitCount(pos - 1);
        return (flips & 1) == 0 ? "Engineer" : "Doctor";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna