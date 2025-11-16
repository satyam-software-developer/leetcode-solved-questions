class Solution {
    public int LCIS(int[] a, int[] b) {
        // code here
        int n = a.length, m = b.length;
        int[] dp = new int[m];
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int cur = 0;
            for(int j = 0; j < m; j++) {
                if(a[i] == b[j]) dp[j] = cur + 1;
                else if(a[i] > b[j]) cur = Math.max(cur, dp[j]);
                ans = Math.max(ans, dp[j]);
            }
        }
        return ans;
    }
}