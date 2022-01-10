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
    List<Integer> res;
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        res = new ArrayList<>();
        inorder(root);
        int i = 0, j = res.size()-1;
        while(i < j) {
            int sum = res.get(i)+res.get(j);
            if(sum == k)
                return true;
            else if(sum < k)
                i++;
            else
                j--;
        }
        return false;
    }
    
    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }

}
