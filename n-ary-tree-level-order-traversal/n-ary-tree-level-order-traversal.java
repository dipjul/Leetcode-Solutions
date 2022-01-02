/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer> currLevel = new ArrayList<>();
            
            for(int i = 0; i < levelSize; i++) {
                Node curr = q.poll();
                currLevel.add(curr.val);
                
                for(Node c:curr.children)
                    q.offer(c);
                
            }
            result.add(currLevel);
        }
        return result;
    }
}