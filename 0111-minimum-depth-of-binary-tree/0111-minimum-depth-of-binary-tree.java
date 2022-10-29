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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int dLeft = root.left != null ? minDepth(root.left) + 1 : 1;
        int dRight = root.right != null ? minDepth(root.right) + 1 : 1;        
        if (dLeft == 1 || dRight == 1) return dLeft + dRight - 1;
        return Math.min(dLeft, dRight);
    }
}