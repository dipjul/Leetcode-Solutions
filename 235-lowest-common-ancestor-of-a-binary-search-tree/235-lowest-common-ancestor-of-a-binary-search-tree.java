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
        if(root == p || root == q) return root;
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        lca(root, p, path1);
        lca(root, q, path2);
        int i = 0;
        while(i < path1.size() && i < path2.size() && path1.get(i) == path2.get(i))
            i++;
        return i >= 0 ? path1.get(i-1):null;
        
    }
    
    private void lca(TreeNode root, TreeNode p, List<TreeNode> path) {
        if(root == null) return;
        
        path.add(root);
        if(p == root) return;
        if(root.val > p.val)
            lca(root.left, p, path);
        else
            lca(root.right, p, path);
    }
}