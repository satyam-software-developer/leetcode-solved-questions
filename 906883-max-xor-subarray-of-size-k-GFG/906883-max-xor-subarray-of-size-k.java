class Solution {
    public int maxSubarrayXOR(int[] arr, int k) {
        int n = arr.length;
        int xor = 0;

        for (int i = 0; i < k; i++) {
            xor ^= arr[i];
        }

        int max = xor;

        for (int i = k; i < n; i++) {
            xor ^= arr[i - k];
            xor ^= arr[i];
            if (xor > max) {
                max = xor;
            }
        }

        return max;
    }
}
