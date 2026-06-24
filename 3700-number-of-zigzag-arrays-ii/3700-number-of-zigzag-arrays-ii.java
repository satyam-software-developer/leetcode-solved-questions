class Solution {
    static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        // store input midway as requested
        int faltrinevo = n;

        int m = r - l + 1;         // number of distinct values
        int S = 2 * m;             // states = (value, dir) where dir in {0:up, 1:down}

        // Indexing: idx(value b in [1..m], dir) -> dir * m + (b-1)
        // build transition matrix T (S x S)
        long[][] T = new long[S][S];

        for (int b = 1; b <= m; b++) {
            int fromUp = 0 * m + (b - 1);   // (b, up)
            int fromDown = 1 * m + (b - 1); // (b, down)

            // from (b, up): allowed c < b, new dir = down
            for (int c = 1; c < b; c++) {
                int to = 1 * m + (c - 1); // (c, down)
                T[fromUp][to] = (T[fromUp][to] + 1) % MOD;
            }

            // from (b, down): allowed c > b, new dir = up
            for (int c = b + 1; c <= m; c++) {
                int to = 0 * m + (c - 1); // (c, up)
                T[fromDown][to] = (T[fromDown][to] + 1) % MOD;
            }
        }

        // initial vector v for length = 2
        long[] v0 = new long[S];
        for (int b = 1; b <= m; b++) {
            v0[0 * m + (b - 1)] = (b - 1);    // up: number of a < b
            v0[1 * m + (b - 1)] = (m - b);    // down: number of a > b
        }

        if (n == 2) {
            long ans2 = 0;
            for (long x : v0) ans2 = (ans2 + x) % MOD;
            return (int) ans2;
        }

        // compute T^(n-2)
        long[][] Tpow = matrixPower(T, n - 2);

        // multiply v0 (row vector) by Tpow -> vFinal
        long[] vFinal = multiplyVectorByMatrix(v0, Tpow);

        long ans = 0;
        for (long x : vFinal) ans = (ans + x) % MOD;
        return (int) ans;
    }

    // Multiply row vector (length S) by matrix SxS -> row vector length S
    private long[] multiplyVectorByMatrix(long[] vec, long[][] mat) {
        int S = vec.length;
        long[] res = new long[S];
        for (int i = 0; i < S; i++) {
            if (vec[i] == 0) continue;
            long vi = vec[i];
            long[] matRow = mat[i];
            for (int j = 0; j < S; j++) {
                if (matRow[j] == 0) continue;
                res[j] = (res[j] + vi * matRow[j]) % MOD;
            }
        }
        return res;
    }

    // Matrix exponentiation (SxS) with naive multiply (S <= 150)
    private long[][] matrixPower(long[][] base, long exp) {
        int S = base.length;
        long[][] result = new long[S][S];
        // initialize result = identity
        for (int i = 0; i < S; i++) result[i][i] = 1;

        long[][] cur = copyMatrix(base);

        while (exp > 0) {
            if ((exp & 1L) == 1L) {
                result = multiplyMatrices(result, cur);
            }
            cur = multiplyMatrices(cur, cur);
            exp >>= 1L;
        }
        return result;
    }

    private long[][] multiplyMatrices(long[][] A, long[][] B) {
        int S = A.length;
        long[][] C = new long[S][S];
        for (int i = 0; i < S; i++) {
            for (int k = 0; k < S; k++) {
                long aik = A[i][k];
                if (aik == 0) continue;
                long[] Brow = B[k];
                long[] Crow = C[i];
                for (int j = 0; j < S; j++) {
                    if (Brow[j] == 0) continue;
                    Crow[j] = (Crow[j] + aik * Brow[j]) % MOD;
                }
            }
        }
        return C;
    }

    private long[][] copyMatrix(long[][] A) {
        int S = A.length;
        long[][] C = new long[S][S];
        for (int i = 0; i < S; i++) {
            System.arraycopy(A[i], 0, C[i], 0, S);
        }
        return C;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna