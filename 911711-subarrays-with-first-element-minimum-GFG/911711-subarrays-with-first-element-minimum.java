import java.util.*;

class Solution {
    public int countSubarrays(int[] arr) {
        int n = arr.length;
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            next[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += next[i] - i;
        }
        
        return (int) ans;
    }
}