class Solution {
    static final int MOD = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        int[] pos = new int[n];
        int[] digit = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int d = s.charAt(i) - '0';
            if (d != 0) {
                pos[cnt] = i;
                digit[cnt] = d;
                cnt++;
            }
        }

        long[] pow10 = new long[cnt + 1];
        pow10[0] = 1;
        for (int i = 1; i <= cnt; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        long[] pref = new long[cnt + 1];
        int[] prefSum = new int[cnt + 1];

        for (int i = 0; i < cnt; i++) {
            pref[i + 1] = (pref[i] * 10 + digit[i]) % MOD;
            prefSum[i + 1] = prefSum[i] + digit[i];
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int left = lowerBound(pos, cnt, l);
            int right = upperBound(pos, cnt, r);

            if (left == right) {
                ans[i] = 0;
                continue;
            }

            int len = right - left;
            long x = (pref[right] - (pref[left] * pow10[len]) % MOD + MOD) % MOD;
            long sum = prefSum[right] - prefSum[left];

            ans[i] = (int) ((x * sum) % MOD);
        }

        return ans;
    }

    private int lowerBound(int[] arr, int n, int target) {
        int l = 0, r = n;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] >= target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    private int upperBound(int[] arr, int n, int target) {
        int l = 0, r = n;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] > target)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna