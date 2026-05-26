class Solution {
    int minToggle(int[] arr) {
        int n = arr.length;
        int[] prefixOnes = new int[n + 1];
        int[] suffixZeros = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixOnes[i + 1] = prefixOnes[i] + (arr[i] == 1 ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; i--) {
            suffixZeros[i] = suffixZeros[i + 1] + (arr[i] == 0 ? 1 : 0);
        }

        int minToggles = Integer.MAX_VALUE;

        for (int i = 0; i <= n; i++) {
            minToggles = Math.min(minToggles, prefixOnes[i] + suffixZeros[i]);
        }

        return minToggles;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna