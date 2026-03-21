import java.util.*;

class Solution {
    public ArrayList<Integer> countBSTs(int[] arr) {
        int n = arr.length;
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sorted[i], i);
        }

        int[] catalan = new int[n + 1];
        catalan[0] = 1;
        if (n >= 1) catalan[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                catalan[i] += catalan[j] * catalan[i - j - 1];
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int pos = map.get(arr[i]);
            int left = pos;
            int right = n - pos - 1;
            res.add(catalan[left] * catalan[right]);
        }

        return res;
    }
}