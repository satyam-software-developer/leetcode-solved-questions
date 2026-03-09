class Solution {
    public String largestSwap(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        // Step 1: Record the last index of each digit (0-9)
        int[] lastIndex = new int[10];
        for (int i = 0; i < n; i++) {
            lastIndex[arr[i] - '0'] = i;
        }

        // Step 2: Traverse from left to right
        for (int i = 0; i < n; i++) {
            int curr = arr[i] - '0';

            // Check if there's a larger digit available later
            for (int d = 9; d > curr; d--) {
                if (lastIndex[d] > i) {
                    // Found a better digit to swap
                    int j = lastIndex[d];
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    return new String(arr);
                }
            }
        }

        // No swap needed
        return s;
    }
}
