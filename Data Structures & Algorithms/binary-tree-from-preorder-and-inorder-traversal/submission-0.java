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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // preorder = [1,2,3,4], inorder = [2,1,3,4]
        // preorder [1] -> root, so in inorder [2](left) [1](root) [3,4](right)
        return helper(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if(preStart > preorder.length - 1 || inStart > inEnd) return null;

        TreeNode tree = new TreeNode(preorder[preStart]);
        int inIndex = 0; // inOrder index of root element in current iteration
        //search
        for(int i = inStart; i <= inEnd; i++) if(inorder[i] == tree.val) inIndex = i;
        
        tree.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);
        tree.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);
        return tree;
    }
}
