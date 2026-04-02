class Solution {
    int countWays(int n, int k) {
        if (n == 1) return k;
        long same = 0;
        long diff = k;
        long mod = Integer.MAX_VALUE;
        for (int i = 2; i <= n; i++) {
            long newSame = diff;
            long newDiff = (same + diff) * (k - 1);
            same = newSame % mod;
            diff = newDiff % mod;
        }
        return (int)((same + diff) % mod);
    }
}