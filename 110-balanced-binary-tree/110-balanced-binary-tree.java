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
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return helper(root) != -1;
    }
    
    private int helper(TreeNode root) {
        if(root == null) return 0;
        int leftSub = helper(root.left);
        if(leftSub == -1)
            return -1;
        int rightSub = helper(root.right);
        if(rightSub == -1)
            return -1;
        if(Math.abs(leftSub - rightSub) > 1)
            return -1;
        return 1 + Math.max(leftSub, rightSub); 
    }
}