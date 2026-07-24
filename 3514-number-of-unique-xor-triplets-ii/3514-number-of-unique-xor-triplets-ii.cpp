class Solution {
public:
    int uniqueXorTriplets(vector<int>& nums) {
        const int MAX = 2048;

        vector<vector<bool>> dp(4, vector<bool>(MAX, false));
        dp[0][0] = true;

        for (int num : nums) {
            for (int k = 3; k >= 1; k--) {
                for (int x = 0; x < MAX; x++) {
                    if (dp[k - 1][x]) {
                        dp[k][x ^ num] = true;
                    }
                }
            }
        }

        int ans = 0;
        for (int x = 0; x < MAX; x++) {
            if (dp[1][x] || dp[3][x]) {
                ans++;
            }
        }

        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna