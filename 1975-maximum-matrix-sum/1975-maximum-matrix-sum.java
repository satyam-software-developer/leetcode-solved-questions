class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int negatives = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int val = matrix[i][j];
                if (val < 0) negatives++;
                int abs = Math.abs(val);
                sum += abs;
                if (abs < min) min = abs;
            }
        }

        if (negatives % 2 == 0) {
            return sum;
        }
        return sum - 2L * min;
    }
}
