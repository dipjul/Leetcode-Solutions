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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean isLeftToRight = true;
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currLevel = new LinkedList<>();
            for(int i = 0; i < levelSize; i++) {
                root = q.poll();
                if(isLeftToRight) {
                    currLevel.add(root.val);
                } else currLevel.add(0, root.val);
                if(root.left != null) q.offer(root.left);
                if(root.right != null) q.offer(root.right);
            }
            isLeftToRight = !isLeftToRight;
            result.add(currLevel);
        }
        return result;
    }
}