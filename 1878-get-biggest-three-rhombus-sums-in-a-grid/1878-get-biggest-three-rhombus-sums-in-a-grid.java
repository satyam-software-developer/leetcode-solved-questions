import java.util.*;

class Solution {
    public int[] getBiggestThree(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                set.add(grid[i][j]);
                int maxSize = Math.min(Math.min(i, m - 1 - i), Math.min(j, n - 1 - j));
                for (int s = 1; s <= maxSize; s++) {
                    int sum = 0;
                    int r = i - s, c = j;
                    for (int k = 0; k < s; k++) sum += grid[r + k][c + k];
                    for (int k = 0; k < s; k++) sum += grid[r + s + k][c + s - k];
                    for (int k = 0; k < s; k++) sum += grid[r + 2 * s - k][c - k];
                    for (int k = 0; k < s; k++) sum += grid[r + s - k][c - s + k];
                    set.add(sum);
                }
            }
        }

        int size = Math.min(3, set.size());
        int[] res = new int[size];
        int idx = 0;
        for (int val : set) {
            if (idx == size) break;
            res[idx++] = val;
        }
        return res;
    }
}