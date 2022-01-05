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
        List<TreeNode> path1 = new ArrayList<>();
        List<TreeNode> path2 = new ArrayList<>();
        if(!isPath(root, path1, p)) return null;
        if(!isPath(root, path2, q)) return null;
        int i = 0;
        while(i < path1.size() && i < path2.size() && path1.get(i) == path2.get(i)) {
            i++;
        }
        return path1.get(i-1);
    }
    
    public boolean isPath(TreeNode root, List<TreeNode> path, TreeNode node) {
        if(root == null) return false;
        path.add(root);
        if(root == node) return true;
        if(isPath(root.left, path, node) || isPath(root.right, path, node))
            return true;
        path.remove(path.size()-1);
        return false;
    }
}