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
    // private Queue<Integer> q = new ArrayDeque<>();
    private int res;
    private int current;
    private void inorder(TreeNode node) {
        if(node == null) return;
        inorder(node.left);
        if(--current == 0) res = node.val;;
        inorder(node.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        // LnR inorder: 2 3 4 5
        // LRn postorder: 2 3 5 4
        // nLR preOrder : 4 3 2 5
        current = k;
        inorder(root);
        // while(--k > 0) q.poll();
        return res;
    }
}
