class Solution {
    public void replaceElements(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();

        arr[0] = temp[0] ^ temp[1];

        for (int i = 1; i < n - 1; i++) {
            arr[i] = temp[i - 1] ^ temp[i + 1];
        }

        arr[n - 1] = temp[n - 2] ^ temp[n - 1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna