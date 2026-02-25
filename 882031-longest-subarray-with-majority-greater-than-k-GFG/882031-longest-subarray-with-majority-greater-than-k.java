import java.util.*;

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int val = arr[i] > k ? 1 : -1;
            prefix[i + 1] = prefix[i] + val;
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            if (stack.isEmpty() || prefix[stack.peek()] > prefix[i]) {
                stack.push(i);
            }
        }

        int maxLen = 0;
        for (int i = n; i >= 0; i--) {
            while (!stack.isEmpty() && prefix[i] > prefix[stack.peek()]) {
                maxLen = Math.max(maxLen, i - stack.pop());
            }
        }

        return maxLen;
    }
}