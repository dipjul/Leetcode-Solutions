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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int sz = q.size();
            for(int i = 0; i < sz; i++) {
                TreeNode curr = q.poll();
                if(curr.val == subRoot.val) {
                    if(isSame(curr, subRoot))
                        return true;
                }
                
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
        }
        return false;
    }
    
    private boolean isSame(TreeNode tree1, TreeNode tree2) {
        if(tree1 == null && tree2 == null) return true;
        if(tree1 == null || tree2 == null) return false;
        return tree1.val == tree2.val && isSame(tree1.left, tree2.left) && isSame(tree1.right, tree2.right);
    }
}