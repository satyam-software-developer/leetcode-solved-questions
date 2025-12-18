class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        long base = 0;
        for (int i = 0; i < n; i++) {
            base += (long) strategy[i] * prices[i];
        }

        long[] d0 = new long[n];
        long[] d1 = new long[n];

        for (int i = 0; i < n; i++) {
            d0[i] = -(long) strategy[i] * prices[i];
            d1[i] = (long) (1 - strategy[i]) * prices[i];
        }

        long[] p0 = new long[n + 1];
        long[] p1 = new long[n + 1];

        for (int i = 0; i < n; i++) {
            p0[i + 1] = p0[i] + d0[i];
            p1[i + 1] = p1[i] + d1[i];
        }

        long ans = base;
        int h = k / 2;

        for (int s = 0; s + k <= n; s++) {
            long gain = (p0[s + h] - p0[s]) + (p1[s + k] - p1[s + h]);
            ans = Math.max(ans, base + gain);
        }

        return ans;
    }
}
