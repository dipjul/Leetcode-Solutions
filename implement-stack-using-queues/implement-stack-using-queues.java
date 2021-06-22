class MyStack {

    private  Deque<Integer> q1, q2;
    /** Initialize your data structure here. */
    public MyStack() {
        q1 = new ArrayDeque<Integer>();
        q2 = new ArrayDeque<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q1.offerLast(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q2.isEmpty()) {
            while(!q1.isEmpty())
                q2.offerLast(q1.pollFirst());
        }
        int d = q2.pollLast();
        return d;
    }
    
    /** Get the top element. */
    public int top() {
        if(!q2.isEmpty())
            return q2.peekLast();
        return q1.peekLast();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty())
            return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */