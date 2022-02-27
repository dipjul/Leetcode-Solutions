class Node {
    int key;
    int value;
    Node prev;
    Node next;
    Node(int k, int v) {
        key = k;
        value = v;
    }
}

class LRUCache {
    Node head = new Node(0, 0);
    Node tail = new Node(0, 0);
    Map<Integer, Node> mp;
    int size;
    public LRUCache(int capacity) {
        head.next = tail;
        tail.prev = head;
        mp = new HashMap<>();
        size = capacity;
    }
    
    public int get(int key) {
        if(mp.containsKey(key)) {
            Node node = mp.get(key);
            remove(node);
            insert(node);
            return node.value;
        } else
            return -1;
    }
    
    public void put(int key, int value) {
        if(mp.containsKey(key)) {
            Node node = mp.get(key);
            remove(node);
        }
        if(size == mp.size())
            remove(tail.prev);
        insert(new Node(key, value));
    }
    
    private void remove(Node node) {
        mp.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private void insert(Node node) {
        Node headNext = head.next;
        head.next = node;
        node.prev = head;
        node.next = headNext;
        headNext.prev = node;
        mp.put(node.key, node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */