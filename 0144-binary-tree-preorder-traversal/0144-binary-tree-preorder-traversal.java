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
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> out = new ArrayList<>();
        preorder(out, root);
        return out;
    }
    
    private void preorder(List<Integer> out, TreeNode n) {
        out.add(n.val);
        
        if (n.left != null) preorder(out, n.left);
        
        if (n.right != null) preorder(out, n.right);
    }
}