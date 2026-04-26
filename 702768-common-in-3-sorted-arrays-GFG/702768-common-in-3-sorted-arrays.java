import java.util.*;

class Solution {
    public ArrayList<Integer> commonElements(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        ArrayList<Integer> res = new ArrayList<>();
        
        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                if (res.isEmpty() || res.get(res.size() - 1) != a[i]) {
                    res.add(a[i]);
                }
                i++;
                j++;
                k++;
            } else {
                int min = Math.min(a[i], Math.min(b[j], c[k]));
                if (a[i] == min) i++;
                if (b[j] == min) j++;
                if (c[k] == min) k++;
            }
        }
        
        return res;
    }
}