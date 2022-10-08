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
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<Integer> out = new ArrayList<>();
        postorder(out, root);
        return out;
    }
    
    private void postorder(List<Integer> out, TreeNode n) {
        if (n.left != null) postorder(out, n.left);
        
        if (n.right != null) postorder(out, n.right);
        
        out.add(n.val);
    }
}