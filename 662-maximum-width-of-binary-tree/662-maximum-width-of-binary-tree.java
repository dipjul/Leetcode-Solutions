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
class Pair {
    int d;
    TreeNode node;
    Pair(TreeNode n, int ds) {
        node = n;
        d = ds;
    }
    
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        if(root == null)
            return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        
        while(!q.isEmpty()) {
            int levelSize = q.size();
            int min = q.peek().d;
            int startD=0, endD=0;
            for(int i = 0; i < levelSize; i++) {
                Pair p = q.poll();
                TreeNode cur = p.node;
                int cur_id = p.d-min;
                if(i == 0)
                    startD = cur_id;
                if(i == levelSize-1)
                    endD = cur_id;
                
                if(cur.left != null) q.offer(new Pair(cur.left, 2*cur_id+1));
                if(cur.right != null) q.offer(new Pair(cur.right, 2*cur_id+2));
            }
            
            max = Math.max(max, endD-startD+1);
        }
        return max;
    }
}