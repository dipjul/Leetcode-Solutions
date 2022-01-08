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
    int totalTilt = 0;

    public int valueSum(TreeNode node) {
        if (node == null)
            return 0;

        int leftSum = valueSum(node.left);
        int rightSum = valueSum(node.right);
        int tilt = Math.abs(leftSum - rightSum);
        totalTilt += tilt;

        // return the sum of values starting from this node.
        return node.val + leftSum + rightSum;
    }

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        valueSum(root);
        return totalTilt;
    }
}