class Solution {
    int maxOnes(int[] arr) {
        int totalOnes = 0;
        for (int x : arr) {
            if (x == 1) totalOnes++;
        }

        int maxGain = 0, current = 0;

        for (int x : arr) {
            int val = (x == 0) ? 1 : -1;
            current = Math.max(val, current + val);
            maxGain = Math.max(maxGain, current);
        }

        return totalOnes + maxGain;
    }
}