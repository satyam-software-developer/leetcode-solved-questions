class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k];
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
