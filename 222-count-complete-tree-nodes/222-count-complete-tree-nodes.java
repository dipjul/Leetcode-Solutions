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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int l = getLeftHeight(root);
        int r = getRightHeight(root);
        if(l == r) return ((2<<l)-1);
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
    
    private int getLeftHeight(TreeNode root) {
        int h = 0;
        
        while(root.left != null) {
            h++;
            root = root.left;
        }
        return h;
    }
    
    private int getRightHeight(TreeNode root) {
        int h = 0;
        
        while(root.right != null) {
            h++;
            root = root.right;
        }
        return h;
    }
}