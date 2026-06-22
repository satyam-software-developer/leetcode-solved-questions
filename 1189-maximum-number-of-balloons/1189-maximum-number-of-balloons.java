class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];

        for (char ch : text.toCharArray()) {
            freq[ch - 'a']++;
        }

        return Math.min(
            Math.min(freq['b' - 'a'], freq['a' - 'a']),
            Math.min(
                Math.min(freq['l' - 'a'] / 2, freq['o' - 'a'] / 2),
                freq['n' - 'a']
            )
        );
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna