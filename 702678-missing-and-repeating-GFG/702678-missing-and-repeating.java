import java.util.*;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int duplicate = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) duplicate = Math.abs(arr[i]);
            else arr[index] = -arr[index];
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) missing = i + 1;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(duplicate);
        res.add(missing);
        return res;
    }
}
