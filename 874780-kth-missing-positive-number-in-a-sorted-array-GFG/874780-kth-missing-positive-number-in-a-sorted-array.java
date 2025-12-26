class Solution {
    public int kthMissing(int[] arr, int k) {
        // code here
        int missingBefore = 0;
        int prev = 0;

        for (int num : arr) {
            int gap = num - prev - 1;
            if (missingBefore + gap >= k) {
                return prev + (k - missingBefore);
            }
            missingBefore += gap;
            prev = num;
        }

        return prev + (k - missingBefore);
        
    }
}