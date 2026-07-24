/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
}*/
class Solution {
    int max = 1;

    public int longestConsecutive(Node root) {
        if (root == null) {
            return -1;
        }

        dfs(root, null, 0);

        return max == 1 ? -1 : max;
    }

    private void dfs(Node node, Node parent, int length) {
        if (node == null) {
            return;
        }

        if (parent != null && node.data == parent.data + 1) {
            length++;
        } else {
            length = 1;
        }

        max = Math.max(max, length);

        dfs(node.left, node, length);
        dfs(node.right, node, length);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna