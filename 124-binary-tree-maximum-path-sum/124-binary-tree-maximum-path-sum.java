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
    public int maxPathSum(TreeNode root) {
        if(root == null) return 0;
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        helperSum(root, max, 0);
        return max[0];
    }
    
    public int helperSum(TreeNode root, int[] max, int sum) {
        if(root == null) return 0;
        int lSum = Math.max(0, helperSum(root.left, max, sum));
        int rSum = Math.max(0, helperSum(root.right, max, sum));
        int currSum = lSum + rSum + root.val;
        max[0] = Math.max(max[0], currSum);
        return root.val + Math.max(lSum, rSum);
    }
}