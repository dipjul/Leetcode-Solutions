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
    int maxDiameter;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        maxDiameter = 0;
        helper(root);
        return maxDiameter;
    }
    
    public int helper(TreeNode root) {
        if(root == null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        int h = 1 + Math.max(l, r);
        maxDiameter = Math.max(maxDiameter, l+r);
        return h;
    }
    
    /*
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int d1 = diameterOfBinaryTree(root.left);
        int d2 = diameterOfBinaryTree(root.right);
        int d3 = dfsHeight(root.left) + dfsHeight(root.right);
        return Math.max(d1, Math.max(d2, d3));
    }
    
    public int dfsHeight(TreeNode root) {
         if(root == null) return 0;
        return 1 + Math.max(dfsHeight(root.left), dfsHeight(root.right));
    }
    */
}