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
    public boolean isBalanced(TreeNode root) {
        return balance(root) != -1;
    }
    
    private int balance(TreeNode n) {
        if (n == null) return 0;
        
        int l = balance(n.left);
        if (l == -1) return -1;
        
        int r = balance(n.right);
        if (r == -1) return -1;
        
        if (l-r > 1 || l-r < -1) return -1;
        
        return Math.max(l, r) + 1;
    }
}