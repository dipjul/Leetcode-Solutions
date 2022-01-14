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
class Tuple {
    TreeNode node;
    int dist;
    int level;
    Tuple(TreeNode n, int d, int l) {
        node = n;
        dist = d;
        level = l;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> mp = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));
        
        while(!q.isEmpty()) {
            Tuple curr = q.poll();
            TreeNode node = curr.node;
            int dist = curr.dist;
            int level = curr.level;
            
            if(!mp.containsKey(dist)) {
                mp.put(dist, new TreeMap<>());
            }
            
            if(!mp.get(dist).containsKey(level)) {
                mp.get(dist).put(level, new PriorityQueue<>());
            }
            
            mp.get(dist).get(level).offer(node.val);
            
            if(node.left != null)
                q.offer(new Tuple(node.left, dist-1, level+1));
            if(node.right != null)
                q.offer(new Tuple(node.right, dist+1, level+1));
        }
        
        for(TreeMap<Integer, PriorityQueue<Integer>> dists: mp.values()) {
            res.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes:dists.values()) {
                while(!nodes.isEmpty()) {
                    res.get(res.size()-1).add(nodes.poll());
                }
            }
        }
        return res;
    }
    
}