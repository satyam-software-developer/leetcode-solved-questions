class Solution {
    public boolean wifiRange(String s, int x) {
        int n = s.length();
        boolean[] covered = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                int left = Math.max(0, i - x);
                int right = Math.min(n - 1, i + x);

                for (int j = left; j <= right; j++) {
                    covered[j] = true;
                }
            }
        }

        for (boolean room : covered) {
            if (!room) {
                return false;
            }
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna