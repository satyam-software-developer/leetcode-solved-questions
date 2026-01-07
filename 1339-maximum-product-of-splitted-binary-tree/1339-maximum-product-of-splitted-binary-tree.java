/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    long total = 0;
    long max = 0;
    int mod = 1000000007;
    
    public int maxProduct(TreeNode root) {
        total = sum(root);
        dfs(root);
        return (int)(max % mod);
    }
    
    long sum(TreeNode node) {
        if (node == null) return 0;
        return node.val + sum(node.left) + sum(node.right);
    }
    
    long dfs(TreeNode node) {
        if (node == null) return 0;
        long curr = node.val + dfs(node.left) + dfs(node.right);
        max = Math.max(max, curr * (total - curr));
        return curr;
    }
}
