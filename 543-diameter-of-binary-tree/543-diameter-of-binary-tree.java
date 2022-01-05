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

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int h = getHeight(root.left)+getHeight(root.right);
        return Math.max(h, Math.max(ld, rd));
    }
    
    public int getHeight(TreeNode root) {
        if(root == null) return 0;
        else {
            int lh = getHeight(root.left);
            int rh = getHeight(root.right);
            return 1+Math.max(lh, rh);
        }

    }
}