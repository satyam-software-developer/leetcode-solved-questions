class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;

        for (int num = num1; num <= num2; num++) {
            char[] s = String.valueOf(num).toCharArray();

            for (int i = 1; i < s.length - 1; i++) {
                if ((s[i] > s[i - 1] && s[i] > s[i + 1]) ||
                    (s[i] < s[i - 1] && s[i] < s[i + 1])) {
                    ans++;
                }
            }
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna