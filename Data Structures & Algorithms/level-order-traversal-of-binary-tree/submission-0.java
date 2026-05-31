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
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            int n = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < n; i++) {
                TreeNode current = queue.poll();
                level.add(current.val);
                if(current.left != null) queue.offer(current.left);
                if(current.right != null) queue.offer(current.right);
            }
            res.add(level);
        }
        return res;
    }
}
