class Solution {
    static final long MOD = 1000000007L;

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;
        int sz = 2 * m;

        long[] base = new long[sz];

        for (int v = 0; v < m; v++) {
            base[v] = v;
            base[m + v] = m - 1 - v;
        }

        long[][] T = new long[sz][sz];

        for (int v = 0; v < m; v++) {
            for (int u = 0; u < v; u++) {
                T[v][m + u] = 1;
            }
            for (int u = v + 1; u < m; u++) {
                T[m + v][u] = 1;
            }
        }

        long[] state = multiply(power(T, n - 2), base);

        long ans = 0;
        for (long x : state) {
            ans = (ans + x) % MOD;
        }

        return (int) ans;
    }

    private long[] multiply(long[][] mat, long[] vec) {
        int n = mat.length;
        long[] res = new long[n];

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = 0; j < n; j++) {
                sum = (sum + mat[i][j] * vec[j]) % MOD;
            }
            res[i] = sum;
        }

        return res;
    }

    private long[][] multiply(long[][] a, long[][] b) {
        int n = a.length;
        long[][] res = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (a[i][k] == 0)
                    continue;
                for (int j = 0; j < n; j++) {
                    if (b[k][j] == 0)
                        continue;
                    res[i][j] = (res[i][j] + a[i][k] * b[k][j]) % MOD;
                }
            }
        }

        return res;
    }

    private long[][] power(long[][] mat, long exp) {
        int n = mat.length;
        long[][] res = new long[n][n];

        for (int i = 0; i < n; i++) {
            res[i][i] = 1;
        }

        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = multiply(res, mat);
            }
            mat = multiply(mat, mat);
            exp >>= 1;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna