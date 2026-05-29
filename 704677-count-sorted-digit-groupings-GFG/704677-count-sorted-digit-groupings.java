class Solution {
    public int validGroups(String s) {
        int n = s.length();
        int[][] dp = new int[n + 1][901];

        return solve(s, 0, 0, dp);
    }

    private int solve(String s, int index, int prevSum, int[][] dp) {
        if (index == s.length()) {
            return 1;
        }

        if (dp[index][prevSum] != 0) {
            return dp[index][prevSum];
        }

        int sum = 0;
        int count = 0;

        for (int i = index; i < s.length(); i++) {
            sum += s.charAt(i) - '0';

            if (sum >= prevSum) {
                count += solve(s, i + 1, sum, dp);
            }
        }

        dp[index][prevSum] = count;
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna