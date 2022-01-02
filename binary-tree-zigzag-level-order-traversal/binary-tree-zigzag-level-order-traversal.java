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
        boolean isLToR = true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            
            List<Integer> currLevel = new ArrayList<>(levelSize);
            
            for(int i = 0; i < levelSize; i++) {
                TreeNode currNode = queue.poll();
                if(isLToR)
                    currLevel.add(currNode.val);
                else
                    currLevel.add(0, currNode.val);
                if(currNode.left != null) queue.offer(currNode.left);
                if(currNode.right != null) queue.offer(currNode.right);
                
            }
            result.add(currLevel);  
            isLToR = !isLToR;
            
        }
        return result;
    }
}