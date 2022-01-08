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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null) return res;
        preorder(root, res, "");
        return res;
    }
    
    public void preorder(TreeNode root, List<String> res, String s) {
        if(root.left == null && root.right == null) {
            res.add(s + root.val);
        }
        if(root.left != null) preorder(root.left, res, s + root.val + "->");
        if(root.right != null) preorder(root.right, res, s + root.val + "->");
    }
}