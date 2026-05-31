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
    public boolean checkSame(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;
        if(node1.val !=  node2.val) return false;
        else return checkSame(node1.left, node2.left) && checkSame(node1.right, node2.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // if(root == null) return false;
        // if(subRoot == null) return true;
        // if(root.val == subRoot.val && isSubtree(root.left, subRoot.left) && isSubtree(root.right, subRoot.right)) return true;
        // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
         if (subRoot == null) return true;
        if (root == null) return false;

        // Try to match trees starting at this node
        if (root.val == subRoot.val) {
            if(checkSame(root, subRoot)) return true;
        }

        // Otherwise, search in left and right subtree
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
