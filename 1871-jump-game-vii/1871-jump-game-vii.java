class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] reachable = new boolean[n];
        reachable[0] = true;

        int count = 0;

        for (int i = 1; i < n; i++) {
            if (i >= minJump && reachable[i - minJump]) {
                count++;
            }

            if (i > maxJump && reachable[i - maxJump - 1]) {
                count--;
            }

            reachable[i] = count > 0 && s.charAt(i) == '0';
        }

        return reachable[n - 1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna