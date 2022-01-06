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
    int max;
    public int maxPathSum(TreeNode root) {
		max = Integer.MIN_VALUE;
		helper(root);
		return max;
	}
	
	int helper(TreeNode root) {
		if(root == null)
			return 0;
		// sum += root.val;
		int lsum = Math.max(0,helper(root.left));
		int rsum = Math.max(0,helper(root.right));
		int sumCurrent = lsum + rsum + root.val;
		max = Math.max(sumCurrent, max);
		return root.val + Math.max(lsum, rsum);
	}
}