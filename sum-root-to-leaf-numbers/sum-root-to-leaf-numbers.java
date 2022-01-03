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
    public int sumNumbers(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        int total = 0;
        dfs(root, new StringBuilder(), result);
        for(int num:result)
            total += num;
        return total;
    }
    
    private void dfs(TreeNode currNode, StringBuilder sb, List<Integer> result) {
        if(currNode == null) return;
        sb.append(currNode.val);
        if(currNode.left == null && currNode.right == null) {
            result.add(Integer.valueOf(sb.toString()));
        } else {
            dfs(currNode.left, sb, result);
            dfs(currNode.right, sb, result);
        }
        sb.deleteCharAt(sb.length()-1);
    }
}