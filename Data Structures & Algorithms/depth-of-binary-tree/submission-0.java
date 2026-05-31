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
    public int maxDepth(TreeNode root) {
        // DFS as we are trying to find the max depth/level a tree can have
        if(root == null) return 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        int res = 0;
        q.offer(root);

        while(!q.isEmpty()) {
            res++;
            int level_width = q.size();
            for(int i = 0; i < level_width; i++) {
                TreeNode current = q.poll();
                if(current.left != null) q.offer(current.left);
                if(current.right != null) q.offer(current.right);
            }
        }
        return res;
    }
}
