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
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> out = new ArrayList<>();
        inorder(out, root);
        return out;
    }
    
    private void inorder(List<Integer> out, TreeNode n) {
        if (n.left != null) inorder(out, n.left);
        
        out.add(n.val);
        
        if (n.right != null) inorder(out, n.right);
    }
}