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
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        TreeNode curr = root;
        while(curr != null) {
            
            if(curr.left != null) {
                TreeNode rightmostInLeftSubTree = curr.left;
                while(rightmostInLeftSubTree.right != null) rightmostInLeftSubTree = rightmostInLeftSubTree.right;
                rightmostInLeftSubTree.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
    /*
    public void flatten(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        TreeNode prev = null;
        while(!st.empty()) {
            TreeNode curr = st.pop();
            if(prev != null) {
                prev.right = curr;
                prev.left = null;
            }
            prev = curr;
            if(curr.right != null) st.push(curr.right);
            if(curr.left != null) st.push(curr.left);
        }
    }
    */

}