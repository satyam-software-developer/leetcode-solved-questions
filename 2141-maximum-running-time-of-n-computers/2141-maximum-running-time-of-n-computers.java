class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long l = 0, r = 0;
        for (int b : batteries) r += b;
        r /= n;
        while (l < r) {
            long mid = (l + r + 1) >> 1;
            long total = 0;
            for (int b : batteries) total += Math.min(b, mid);
            if (total >= mid * n) l = mid;
            else r = mid - 1;
        }
        return l;
    }
}
