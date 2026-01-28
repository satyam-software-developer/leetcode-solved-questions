import java.util.*;

class Solution {
    public int countSubset(int[] arr, int k) {
        int n = arr.length;
        int mid = n / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);

        List<Integer> leftSums = new ArrayList<>();
        List<Integer> rightSums = new ArrayList<>();

        generateSums(left, 0, 0, leftSums);
        generateSums(right, 0, 0, rightSums);

        Collections.sort(rightSums);

        int count = 0;
        for (int s : leftSums) {
            int target = k - s;
            count += upperBound(rightSums, target) - lowerBound(rightSums, target);
        }

        return count;
    }

    private void generateSums(int[] arr, int index, int sum, List<Integer> list) {
        if (index == arr.length) {
            list.add(sum);
            return;
        }
        generateSums(arr, index + 1, sum, list);
        generateSums(arr, index + 1, sum + arr[index], list);
    }

    private int lowerBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) < target) l = m + 1;
            else r = m;
        }
        return l;
    }

    private int upperBound(List<Integer> list, int target) {
        int l = 0, r = list.size();
        while (l < r) {
            int m = (l + r) / 2;
            if (list.get(m) <= target) l = m + 1;
            else r = m;
        }
        return l;
    }
}
