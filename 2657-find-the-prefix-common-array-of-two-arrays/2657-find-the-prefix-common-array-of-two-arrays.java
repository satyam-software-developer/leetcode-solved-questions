class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length; // Length of the arrays
        int[] C = new int[n]; // Prefix common array
        boolean[] seen = new boolean[n + 1]; // To track seen numbers
        int commonCount = 0; // Counter for common numbers

        for (int i = 0; i < n; i++) {
            // Mark the current elements of A and B as seen
            if (!seen[A[i]]) {
                seen[A[i]] = true;
            } else {
                commonCount++;
            }

            if (!seen[B[i]]) {
                seen[B[i]] = true;
            } else {
                commonCount++;
            }

            // Store the current count of common elements in C[i]
            C[i] = commonCount;
        }

        return C;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna