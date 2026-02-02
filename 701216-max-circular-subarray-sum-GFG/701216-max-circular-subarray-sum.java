class Solution {
    public int maxCircularSum(int[] arr) {
        int total = 0;
        int maxKadane = kadane(arr);  // Case 1: normal max sum
        int minSum = arr[0];          // For min subarray sum
        int currMin = arr[0];

        total = arr[0];
        for (int i = 1; i < arr.length; i++) {
            total += arr[i];
            currMin = Math.min(arr[i], currMin + arr[i]);
            minSum = Math.min(minSum, currMin);
        }

        // Case 2: wrapping sum is total - minSum
        int maxWrap = total - minSum;

        // If all elements are negative, return normal max
        if (maxWrap == 0) return maxKadane;

        return Math.max(maxKadane, maxWrap);
    }

    private int kadane(int[] arr) {
        int maxSoFar = arr[0], currMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
        }
        return maxSoFar;
    }
}
