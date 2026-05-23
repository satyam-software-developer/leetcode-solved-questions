class Solution {
    public void toSumTree(Node root) {
        solve(root);
    }

    private int solve(Node root) {
        if (root == null) {
            return 0;
        }

        int oldValue = root.data;

        int leftSum = solve(root.left);
        int rightSum = solve(root.right);

        root.data = leftSum + rightSum;

        return oldValue + root.data;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna