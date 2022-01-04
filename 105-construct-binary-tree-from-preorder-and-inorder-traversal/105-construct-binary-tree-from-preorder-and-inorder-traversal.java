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
    int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return cTree(preorder, inorder, 0, inorder.length-1);
    }
    
    public TreeNode cTree(int[] pre, int[] in, int inStart, int inEnd) {
        if(inStart > inEnd) return null;
        TreeNode root = new TreeNode(pre[preIndex++]);
        int inIndex = inStart;
        for(int i = inStart; i <= inEnd; i++) {
            if(in[i] == root.val) {
                inIndex = i;
                break;
            }
        }
        
        root.left = cTree(pre, in, inStart, inIndex-1);
        root.right = cTree(pre, in, inIndex+1, inEnd);
        return root;
    }
}