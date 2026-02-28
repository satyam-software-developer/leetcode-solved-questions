import java.util.*;

class Solution {
    public static ArrayList<Integer> findClosestPair(int arr1[], int arr2[], int x) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = m - 1;
        long minDiff = Long.MAX_VALUE;
        int a = 0, b = 0;
        
        while (i < n && j >= 0) {
            long sum = (long) arr1[i] + arr2[j];
            long diff = Math.abs(sum - x);
            
            if (diff < minDiff) {
                minDiff = diff;
                a = arr1[i];
                b = arr2[j];
            }
            
            if (sum > x) {
                j--;
            } else {
                i++;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }
}