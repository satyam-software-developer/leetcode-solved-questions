class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] minPref = new long[k];
        for (int i = 0; i < k; i++) minPref[i] = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long prefix = 0;
        minPref[0] = 0;
        for (int i = 0; i < n; i++) {
            prefix += nums[i];
            int r = (i + 1) % k;
            if (minPref[r] != Long.MAX_VALUE) {
                maxSum = Math.max(maxSum, prefix - minPref[r]);
            }
            minPref[r] = Math.min(minPref[r], prefix);
        }
        return maxSum;
    }
}