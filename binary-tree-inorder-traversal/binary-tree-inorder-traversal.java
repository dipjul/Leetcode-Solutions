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
    public List<Integer> inorderTraversal(TreeNode root) {
/*
Morri's traversal:
    Steps:
    1. if left is null then visit the node and go to right
    2. else find the predecessor
        2.1 To find predecessor keep going right till right node is not null or right node is not current
        2.2 if right node is null then go left after establishing link from predecessor to current
        2.3 left is already visit. Go right after visiting current
*/
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        
        TreeNode curr = root;
        
        while(curr != null) {
            // Step1:
            if(curr.left == null) {
                result.add(curr.val);
                curr = curr.right;
            }
            // Step2:
            else {
                TreeNode pred = curr.left;
                // Step2.1:
                while(pred.right != curr && pred.right != null) {
                    pred = pred.right;
                }
                // Step2.2:
                if(pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }
                // Step2.3:
                else {
                    pred.right = null;
                    result.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return result;
        
    }
}