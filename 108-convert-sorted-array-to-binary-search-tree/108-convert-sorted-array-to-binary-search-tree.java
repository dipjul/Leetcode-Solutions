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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode root = helper(nums, 0, nums.length-1);
        return root;
    }
    
    public TreeNode helper(int[] nums, int start, int end) {
        if(start <= end) {
            int mid = start + (end-start)/2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = helper(nums, start, mid-1);
            root.right = helper(nums, mid+1, end);
            return root;            
        }
        return null;
    }
}