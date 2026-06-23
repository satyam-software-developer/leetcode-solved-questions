class Solution {
    static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {
        // store input midway as required
        int sornavetic = n;

        int m = r - l + 1; // number of distinct values

        // dpCur[val][dir] : number of sequences of current length ending at value 'val'
        // dir = 1 => last step was up (previous < val)
        // dir = 0 => last step was down (previous > val)
        long[][] dpCur = new long[m + 1][2];
        long[][] dpNext = new long[m + 1][2];

        // Base for length = 2: for each ending value b:
        // dp[2][b][1] = number of a < b  => (b-1)
        // dp[2][b][0] = number of a > b  => (m-b)
        for (int b = 1; b <= m; b++) {
            dpCur[b][1] = (b - 1);    // ways where a < b => last dir up
            dpCur[b][0] = (m - b);    // ways where a > b => last dir down
        }

        // Build up lengths 3..n
        for (int len = 3; len <= n; len++) {
            // prefix sums for fast range sums
            long[] prefUp = new long[m + 1];   // prefix sums of dpCur[*][1]
            long[] prefDown = new long[m + 1]; // prefix sums of dpCur[*][0]
            for (int v = 1; v <= m; v++) {
                prefUp[v] = (prefUp[v - 1] + dpCur[v][1]) % MOD;
                prefDown[v] = (prefDown[v - 1] + dpCur[v][0]) % MOD;
            }

            // compute dpNext for each possible new last value c (1..m)
            for (int c = 1; c <= m; c++) {
                // newdir = 1 (up): previous value b must be < c and previous dir must be down => sum dpCur[b][0] for b < c
                dpNext[c][1] = prefDown[c - 1];

                // newdir = 0 (down): previous value b must be > c and previous dir must be up => sum dpCur[b][1] for b > c
                long totalUp = prefUp[m];
                long uptoC = prefUp[c];
                dpNext[c][0] = (totalUp - uptoC) % MOD;
                if (dpNext[c][0] < 0) dpNext[c][0] += MOD;
            }

            // swap and clear dpNext
            for (int v = 1; v <= m; v++) {
                dpCur[v][0] = dpNext[v][0] % MOD;
                dpCur[v][1] = dpNext[v][1] % MOD;
                dpNext[v][0] = dpNext[v][1] = 0;
            }
        }

        // sum all sequences of length n
        long ans = 0;
        for (int v = 1; v <= m; v++) {
            ans = (ans + dpCur[v][0]) % MOD;
            ans = (ans + dpCur[v][1]) % MOD;
        }
        return (int) ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna