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
    private List<Integer> arr;
    private int index;
    public void recoverTree(TreeNode root) {
        arr = new ArrayList<>();
        index = 0;
        inorder(root);
        Collections.sort(arr);
        inorderSwap(root);
    }
    
    private void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }
    
    private void inorderSwap(TreeNode root) {
        if(root == null) return;
        inorderSwap(root.left);
        if(root.val != arr.get(index))
            root.val = arr.get(index);
        index++;
        inorderSwap(root.right);
    }
}