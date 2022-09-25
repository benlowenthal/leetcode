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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, null, null);
    }
    
    private boolean isValid(TreeNode n, Integer min, Integer max) {
        if (n == null) return true;
        
        if (min != null && n.val <= min) return false;
        if (max != null && n.val >= max) return false;
        
        return isValid(n.left, min, n.val) && isValid(n.right, n.val, max);
    }
}