import java.util.*;

class Solution {
    public int maxPeople(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i : i - stack.peek() - 1;
            stack.push(i);
        }

        stack.clear();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? (n - i - 1) : stack.peek() - i - 1;
            stack.push(i);
        }

        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, left[i] + right[i] + 1);
        }

        return max;
    }
}
