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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null)
            return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>(levelSize);
            
            for(int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                currLevel.add(currNode.val);
                if(currNode.left != null)
                    queue.offer(currNode.left);
                if(currNode.right != null)
                    queue.offer(currNode.right);
            }
            
            result.add(currLevel);
        }
        return result;
    }
}