class Solution {
    int subsetXORSum(int arr[]) {
        // code here
        int n = arr.length;
        int or = 0;
        for(int x : arr) or |= x;
        return or * (1 << (n - 1));
        
    }
}