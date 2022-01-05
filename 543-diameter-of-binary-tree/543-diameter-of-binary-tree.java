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
    Map<TreeNode, Integer> mp;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        mp = new HashMap<>();
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int h = getHeight(root.left, mp)+getHeight(root.right, mp);
        return Math.max(h, Math.max(ld, rd));
    }
    
    public int getHeight(TreeNode root, Map<TreeNode, Integer> mp) {
        if(root == null) return 0;
        if(mp.containsKey(root)) return mp.get(root);
        else {
            int lh = getHeight(root.left, mp);
            int rh = getHeight(root.right, mp);
            mp.put(root, 1+Math.max(lh, rh));
            return 1+Math.max(lh, rh);
        }

    }
}