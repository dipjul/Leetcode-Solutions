/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode, TreeNode> track_parent = new HashMap<>();
        
        markParents(root, track_parent);
        
        Set<TreeNode> visited = new HashSet<>();
        Queue<TreeNode> q = new LinkedList<>();
        
        q.offer(target);
        visited.add(target);
        
        int curr_level = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            
            if(curr_level == k) break;
            
            curr_level++;
            
            for(int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                // go left
                if(curr.left != null && !visited.contains(curr.left)) {
                    q.offer(curr.left);
                    visited.add(curr.left);
                }
                // go right
                if(curr.right != null && !visited.contains(curr.right)) {
                    q.offer(curr.right);
                    visited.add(curr.right);
                }
                // go top
                if(track_parent.get(curr) != null && !visited.contains(track_parent.get(curr))) {
                    q.offer(track_parent.get(curr));
                    visited.add(track_parent.get(curr));
                }
            }
            
        }
        List<Integer> res = new ArrayList<>();
        while(!q.isEmpty())
            res.add(q.poll().val);
        return res;
    }
    
    // make connection of each node with it's parent
    private void markParents(TreeNode root, Map<TreeNode, TreeNode> track_parent) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            TreeNode curr = q.poll();
            
            if(curr.left != null) {
                track_parent.put(curr.left, curr);
                q.offer(curr.left);
            }
            
            if(curr.right != null) {
                track_parent.put(curr.right, curr);
                q.offer(curr.right);
            }
        }
    }
}