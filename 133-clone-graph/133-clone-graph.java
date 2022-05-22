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
        if (node == null) return null;
        Map<Integer, Node> mp = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        Set<Node> set = new HashSet<>();
        q.offer(node);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            set.add(curr);

            List<Node> nei = curr.neighbors;
            ArrayList<Node> newNei = new ArrayList<>();
            for (Node n : nei) {
                if (!set.contains(n)) q.offer(n);
                if (!mp.containsKey(n.val)) {
                    Node newN = new Node(n.val);
                    mp.put(newN.val, newN);
                    newNei.add(newN);
                } else {
                    Node newN = mp.get(n.val);
                    newNei.add(newN);
                }
            }
            if (!mp.containsKey(curr.val)) {
                Node newNode = new Node(curr.val, newNei);
                mp.put(curr.val, newNode);
            } else {
                Node newNode = mp.get(curr.val);
                newNode.neighbors = newNei;
                mp.put(curr.val, newNode);
            }
        }

        return mp.get(node.val);
    }
}
