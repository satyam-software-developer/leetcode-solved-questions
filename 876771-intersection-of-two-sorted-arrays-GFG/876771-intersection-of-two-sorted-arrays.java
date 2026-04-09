import java.util.*;

class Solution {
    ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0, j = 0;
        int last = Integer.MIN_VALUE;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (a[i] != last) {
                    res.add(a[i]);
                    last = a[i];
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }

        return res;
    }
}