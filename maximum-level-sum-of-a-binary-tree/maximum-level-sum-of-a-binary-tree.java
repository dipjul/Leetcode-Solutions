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
    
    public int maxLevelSum(TreeNode root) {
        int result = 1;
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int maxlevelSum = Integer.MIN_VALUE;
        while(!q.isEmpty()) {
            level++;
            int levelSize = q.size();
            
            int levelSum = 0;
            for(int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                levelSum += curr.val;
                
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            if(maxlevelSum < levelSum) {
                maxlevelSum = levelSum;
                result = level;
            }
        }
        return result;
        
    }
}