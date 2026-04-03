import java.util.*;

class Solution {
    static ArrayList<Integer> diagView(int mat[][]) {
        int n = mat.length;
        ArrayList<Integer> res = new ArrayList<>();
        
        for (int d = 0; d < n; d++) {
            int i = 0, j = d;
            while (j >= 0) {
                res.add(mat[i][j]);
                i++;
                j--;
            }
        }
        
        for (int d = 1; d < n; d++) {
            int i = d, j = n - 1;
            while (i < n) {
                res.add(mat[i][j]);
                i++;
                j--;
            }
        }
        
        return res;
    }
}