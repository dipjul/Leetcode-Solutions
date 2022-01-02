/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // Node result = null;
        if(root == null) return null;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()) {
            int levelSize = q.size();
            // Node prev = null;
            List<Node> currLevel = new ArrayList<>(levelSize);
            for(int i = 0; i < levelSize; i++) {
                Node curr = q.poll();
                currLevel.add(curr);
                
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);
            }
            
            for(int i = 1; i < levelSize; i++) {
                currLevel.get(i-1).next = currLevel.get(i);
            }
        }
        return root;
    }
}