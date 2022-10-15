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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> out = new ArrayList<>();
        
        if (root == null) return out;
        
        TreeNode flag = new TreeNode(1234);
        
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        q.add(flag);
        
        List<Integer> curr = new ArrayList<>();
        
        while (!q.isEmpty()) {
            TreeNode n = q.remove();
            
            if (n.val == flag.val) {
                out.add(new ArrayList<>(curr));
                curr.clear();
                if (!q.isEmpty()) q.add(flag);
            } else {
                curr.add(n.val);
                if (n.left != null) q.add(n.left);
                if (n.right != null) q.add(n.right);
            }
        }
        
        return out;
    }
}