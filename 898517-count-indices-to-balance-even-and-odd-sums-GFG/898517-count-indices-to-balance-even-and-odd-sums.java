class Solution {
    public int cntWays(int[] arr) {
        // code here
         int n = arr.length;
        int[] preEven = new int[n + 1];
        int[] preOdd = new int[n + 1];

        for (int i = 0; i < n; i++) {
            preEven[i + 1] = preEven[i];
            preOdd[i + 1] = preOdd[i];
            if (i % 2 == 0) {
                preEven[i + 1] += arr[i];
            } else {
                preOdd[i + 1] += arr[i];
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int evenSum = preEven[i] + (preOdd[n] - preOdd[i + 1]);
            int oddSum = preOdd[i] + (preEven[n] - preEven[i + 1]);
            if (evenSum == oddSum) {
                count++;
            }
        }

        return count;
    }
}
