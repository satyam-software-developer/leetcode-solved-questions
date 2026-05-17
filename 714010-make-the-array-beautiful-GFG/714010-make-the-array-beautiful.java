import java.util.*;

class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (!stack.isEmpty() &&
                ((stack.peek() >= 0 && num < 0) || (stack.peek() < 0 && num >= 0))) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        return new ArrayList<>(stack);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna