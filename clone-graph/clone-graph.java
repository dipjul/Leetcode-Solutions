/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

        HashMap<Integer, Node> vis = new HashMap();
        
        return dfsClone(node, vis);
    }
    
    private Node dfsClone(Node src, HashMap<Integer, Node> vis) {
        if(src == null) return null;
        
        if(vis.containsKey(src.val))
            return vis.get(src.val);

        Node newNode = new Node(src.val, new ArrayList<>());
        vis.put(newNode.val, newNode);
        for(Node neig : src.neighbors) {
            newNode.neighbors.add(dfsClone(neig, vis));
        }
        return newNode;
    }
}