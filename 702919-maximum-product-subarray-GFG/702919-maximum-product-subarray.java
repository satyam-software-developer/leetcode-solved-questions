class Solution {
    int maxProduct(int[] arr) {
        int maxEnding = arr[0];
        int minEnding = arr[0];
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];

            if (curr < 0) {
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(curr, maxEnding * curr);
            minEnding = Math.min(curr, minEnding * curr);

            result = Math.max(result, maxEnding);
        }

        return result;
    }
}
