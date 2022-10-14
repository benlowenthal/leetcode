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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return new ArrayList<>();
        
        List<List<Integer>> ps = new ArrayList<>();
        path(root, targetSum, new ArrayList<>(), ps);
        return ps;
    }
        
    private void path(TreeNode root, int target, List<Integer> p, List<List<Integer>> paths) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (target == root.val) {
                p.add(root.val);
                paths.add(new ArrayList<>(p));
                p.remove(p.size() - 1);
            } else return;
        }
        
        p.add(root.val);
        path(root.left, target - root.val, p, paths);
        path(root.right, target - root.val, p, paths);
        p.remove(p.size() - 1);
    }
}