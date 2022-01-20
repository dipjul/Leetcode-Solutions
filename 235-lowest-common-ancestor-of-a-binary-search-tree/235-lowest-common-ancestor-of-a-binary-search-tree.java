/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        int curr = root.val;
        if(curr > p.val && curr > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else if(curr < p.val && curr < q.val)
            return lowestCommonAncestor(root.right, p, q);
        return root;
    }
    
    /*
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == p || root == q) return root;
        return lca(root, p, q);
        
    }
    
    private TreeNode lca(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val) {
            return lca(root.left, p, q);
        } else if(root.val < p.val && root.val < q.val) {
            return lca(root.right, p, q);
        }
        return root;
    }
    */
}