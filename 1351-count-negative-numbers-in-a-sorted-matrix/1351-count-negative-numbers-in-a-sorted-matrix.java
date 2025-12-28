class Solution {
    public int countNegatives(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int count = 0;
        int row = m - 1, col = n - 1;

        while (row >= 0) {
            while (col >= 0 && grid[row][col] < 0) {
                col--;
                count++;
            }
            row--;
            col = n - 1;
        }

        return count;
    }
}
