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
    Map<Integer, Integer> mp;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        mp = new HashMap<>();
        for(int i = 0; i < inorder.length; i++) {
            mp.put(inorder[i], i);
        }
        return cTree(preorder, inorder, 0, inorder.length-1, mp);
    }
    
    public TreeNode cTree(int[] pre, int[] in, int inStart, int inEnd, Map<Integer, Integer> mp) {
        if(inStart > inEnd) return null;
        TreeNode root = new TreeNode(pre[preIndex++]);
        int inIndex = inStart;

        
        root.left = cTree(pre, in, inStart, mp.get(root.val)-1, mp);
        root.right = cTree(pre, in, mp.get(root.val)+1, inEnd, mp);
        return root;
    }
}