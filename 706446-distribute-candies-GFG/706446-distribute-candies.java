/*
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
*/


class Solution {
    int moves = 0;  // To store the total number of moves

    public int distCandy(Node root) {
        // Start the recursive DFS traversal
        distributeCandies(root);
        return moves;  // Return the number of moves
    }

    // Helper function to calculate the excess candies and number of moves
    private int distributeCandies(Node root) {
        if (root == null) {
            return 0;  // No candies at null node
        }

        // Recursively calculate the excess candies from the left and right subtrees
        int leftExcess = distributeCandies(root.left);
        int rightExcess = distributeCandies(root.right);

        // The current node's excess candies: candies at current node - 1
        int excess = root.data + leftExcess + rightExcess - 1;

        // Add the absolute value of excess candies to the move count
        moves += Math.abs(excess);

        return excess;  // Return the excess candies to the parent node
    }
}
