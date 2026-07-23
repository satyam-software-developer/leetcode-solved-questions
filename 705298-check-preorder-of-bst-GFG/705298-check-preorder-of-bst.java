import java.util.*;

class Solution {
    public boolean canRepresentBST(List<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MIN_VALUE;

        for (int val : arr) {
            if (val < root) {
                return false;
            }

            while (!stack.isEmpty() && val > stack.peek()) {
                root = stack.pop();
            }

            stack.push(val);
        }

        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna