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
    int result = 0;
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return result;
    }
    
    private void dfs(TreeNode root, int tmpSum) {
        if(root == null)
            return;
        if(root.left == null && root.right == null) {
            tmpSum += root.val;
            result += tmpSum;
            return;
        }
        tmpSum += root.val;
        dfs(root.left, tmpSum * 10);
        dfs(root.right, tmpSum * 10);
    }
}