class Solution {
    int maxSubstring(String s) {
        int maxSoFar = Integer.MIN_VALUE;
        int curr = 0;

        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) == '0' ? 1 : -1;
            curr = Math.max(val, curr + val);
            maxSoFar = Math.max(maxSoFar, curr);
        }

        return maxSoFar <= 0 ? -1 : maxSoFar;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna