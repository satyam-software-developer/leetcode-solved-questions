import java.util.*;

class Solution {
    public long maxPower(int[] stations, int r, int k) {
        int n = stations.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) prefix[i + 1] = prefix[i] + stations[i];
        long[] power = new long[n];
        for (int i = 0; i < n; i++) {
            int left = Math.max(0, i - r);
            int right = Math.min(n - 1, i + r);
            power[i] = prefix[right + 1] - prefix[left];
        }

        long low = 0, high = (long)1e18, ans = 0;
        while (low <= high) {
            long mid = (low + high) / 2;
            if (canAchieve(mid, power.clone(), r, k)) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }

    private boolean canAchieve(long target, long[] power, int r, long k) {
        int n = power.length;
        long[] added = new long[n];
        long sumAdd = 0;
        for (int i = 0; i < n; i++) {
            if (i - r - 1 >= 0) sumAdd -= added[i - r - 1];
            if (power[i] + sumAdd < target) {
                long need = target - (power[i] + sumAdd);
                if (need > k) return false;
                k -= need;
                sumAdd += need;
                if (i + r < n) added[i + r] = need;
            }
        }
        return true;
    }
}
