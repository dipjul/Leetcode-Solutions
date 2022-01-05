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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left, root.right);
    }
    
    public boolean helper(TreeNode leftSubtree, TreeNode rightSubtree) {
        if(leftSubtree == null && rightSubtree == null)
            return true;
        if(leftSubtree != null && rightSubtree != null) {
            return leftSubtree.val == rightSubtree.val && helper(leftSubtree.right, rightSubtree.left) && helper(leftSubtree.left, rightSubtree.right);
        }
        return false;
    }
}