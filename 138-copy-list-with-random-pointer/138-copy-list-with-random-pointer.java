/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node tmp = head;
        Node copy = new Node(0);
        Node curr = copy;
        
        Map<Node, Node> mp = new HashMap<>();
        while(tmp != null) {
            curr.next = new Node(tmp.val);
            curr = curr.next;
            mp.put(tmp, curr);
            tmp = tmp.next;
        }
        
        for(Node node:mp.keySet()) {
            Node copyNode = mp.get(node);
            copyNode.random = mp.get(node.random);
        }
        
        return copy.next;
    }
}