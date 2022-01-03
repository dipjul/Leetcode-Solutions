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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, result, new ArrayList<>(), targetSum);
        return result;
    }
    
    private void dfs(TreeNode root, List<List<Integer>> result, List<Integer> tmpList, int targetSum) {
        if(root == null) return;
        tmpList.add(root.val);
        if(root.left == null && root.right == null && root.val == targetSum) {
            result.add(new ArrayList<>(tmpList));
        } else {
            dfs(root.left, result, tmpList, targetSum-root.val);
            dfs(root.right, result, tmpList, targetSum-root.val);
        }
        
        tmpList.remove(tmpList.size()-1);

    }
}