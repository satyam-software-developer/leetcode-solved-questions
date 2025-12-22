// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
         int n = arr.length;
        int m = arr[0].length;
        int maxRow = -1;
        int maxOnes = 0;

        for (int i = 0; i < n; i++) {
            int low = 0, high = m - 1, firstOne = m;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[i][mid] == 1) {
                    firstOne = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            int onesCount = m - firstOne;
            if (onesCount > maxOnes) {
                maxOnes = onesCount;
                maxRow = i;
            }
        }
        return maxOnes == 0 ? -1 : maxRow;
    }
}