class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(String s : tokens) {
            if(s.equals("+")) {
                st.push(st.pop()+st.pop());
            } else if(s.equals("-")) {
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1-n2);
            } else if(s.equals("*")) {
                st.push(st.pop()*st.pop());
            } else if(s.equals("/")) {
                int n2 = st.pop();
                int n1 = st.pop();
                st.push(n1/n2);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        
        return st.peek();
    }
    
}
