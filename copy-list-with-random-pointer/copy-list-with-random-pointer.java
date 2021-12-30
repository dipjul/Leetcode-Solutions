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
        Map<Node, Node> mp = new HashMap();
        Node curr = head;
        while(curr != null) {
            mp.put(curr, new Node(curr.val));
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null) {
            mp.get(curr).next = mp.get(curr.next);
            mp.get(curr).random = mp.get(curr.random);
            curr = curr.next;
        }
        Node newHead = mp.get(head);
        return newHead;
    }
}