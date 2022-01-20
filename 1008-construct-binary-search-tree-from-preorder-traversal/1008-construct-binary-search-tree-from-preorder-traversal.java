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
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, Integer.MAX_VALUE, new int[]{0});
    }
    
    private TreeNode helper(int[] pre, int upperbound, int[] index) {
        if(index[0] == pre.length) return null;
        if(pre[index[0]] > upperbound) return null;
        TreeNode root = new TreeNode(pre[index[0]++]);
        root.left = helper(pre, root.val, index);
        root.right = helper(pre, upperbound, index);
        return root;
    }
    /*
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        for(int i = 1; i < preorder.length; i++)
            insertIntoBST(root, preorder[i]);
        return root;
    }
    
    private void insertIntoBST(TreeNode root, int val) {
        TreeNode curr = root;
        TreeNode prev = null;
        
        while(curr != null) {
            prev = curr;
            if(curr.val < val)
                curr = curr.right;
            else
                curr = curr.left;
        }
        
        if(prev.val > val)
            prev.left = new TreeNode(val);
        else
            prev.right = new TreeNode(val);
    }
     */  

    

}