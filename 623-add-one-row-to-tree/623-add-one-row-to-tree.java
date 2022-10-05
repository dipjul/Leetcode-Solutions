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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode head = new TreeNode(val);
            head.left = root;
            return head;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 1;
        while(!q.isEmpty() && count < depth) {
            int size = q.size();
            if(count == depth-1) {
                for(int i = 0; i < size; i++) {
                    TreeNode curr = q.poll();
                    TreeNode tmp1 = new TreeNode(val);
                    TreeNode tmp2 = new TreeNode(val);
                    TreeNode left = curr.left;
                    TreeNode right = curr.right;
                    curr.left = tmp1;
                    curr.right = tmp2;
                    tmp1.left = left;
                    tmp2.right = right;
                }
                break;
            }
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if(curr.left != null)
                    q.offer(curr.left);
                if(curr.right != null)
                    q.offer(curr.right);
            }
            count++;
        }
        return root;
    }
}