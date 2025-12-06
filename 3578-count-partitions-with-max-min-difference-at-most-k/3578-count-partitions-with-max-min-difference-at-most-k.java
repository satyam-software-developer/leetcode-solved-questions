class Solution {
    public int countPartitions(int[] nums, int k) {
        int mod = 1000000007;
        int n = nums.length;
        long[] dp = new long[n + 1];
        dp[0] = 1;
        
        for (int i = 1; i <= n; i++) {
            long max = nums[i - 1], min = nums[i - 1];
            for (int j = i - 1; j >= 0; j--) {
                max = Math.max(max, nums[j]);
                min = Math.min(min, nums[j]);
                if (max - min > k) break;
                dp[i] = (dp[i] + dp[j]) % mod;
            }
        }
        
        return (int) dp[n];
    }
}
