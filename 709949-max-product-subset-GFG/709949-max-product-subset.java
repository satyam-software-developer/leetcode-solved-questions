class Solution {
    public int findMaxProduct(int[] arr) {
        long mod = 1000000007L;
        long product = 1;
        int negativeCount = 0;
        int zeroCount = 0;
        int maxNegative = Integer.MIN_VALUE;
        int nonZeroCount = 0;

        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
                continue;
            }

            nonZeroCount++;
            product = (product * ((num % mod + mod) % mod)) % mod;

            if (num < 0) {
                negativeCount++;
                maxNegative = Math.max(maxNegative, num);
            }
        }

        if (nonZeroCount == 0) {
            return 0;
        }

        if (negativeCount == 1 && nonZeroCount == 1) {
            return zeroCount > 0 ? 0 : maxNegative;
        }

        if ((negativeCount & 1) == 1) {
            long remove = ((maxNegative % mod) + mod) % mod;
            product = (product * modInverse(remove, mod)) % mod;
        }

        return (int) product;
    }

    private long modInverse(long a, long mod) {
        return power(a, mod - 2, mod);
    }

    private long power(long a, long b, long mod) {
        long result = 1;

        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna