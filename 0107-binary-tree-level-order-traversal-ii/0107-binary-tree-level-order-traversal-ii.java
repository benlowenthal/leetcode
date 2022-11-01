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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return new ArrayList<>();
        
        List<List<Integer>> arr = new ArrayList<>();
        levelOrder(root, arr, 0);
        Collections.reverse(arr);
        return arr;
    }
    
    private void levelOrder(TreeNode n, List<List<Integer>> out, int level) {
        if (out.size() < level + 1) out.add(new ArrayList<>());
        
        if (n.left != null) levelOrder(n.left, out, level + 1);
        if (n.right != null) levelOrder(n.right, out, level + 1);
        
        out.get(level).add(n.val);
    }
}