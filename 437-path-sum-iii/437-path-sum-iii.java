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
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        help(root, targetSum);
        return count;
    }
    
    private void help(TreeNode root, int targetSum) {
        if(root == null)
            return;
        helper(root, targetSum, 0);
        help(root.left, targetSum);
        help(root.right, targetSum);
    }
    
    private void helper(TreeNode root, int targetSum, long sum) {
        if(root == null)
            return;
        sum += root.val;
        if(sum == targetSum)
            count++;
        
        helper(root.left, targetSum, sum);
        helper(root.right, targetSum, sum);
    }
}