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
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        getHeight(root);
        return res;
    }
    
    public int getHeight(TreeNode root) {
        if(root == null) return 0;
        int lh = getHeight(root.left);
        int rh = getHeight(root.right);
        res = Math.max(res, lh+ rh);
        return 1+Math.max(lh, rh);
    }

}