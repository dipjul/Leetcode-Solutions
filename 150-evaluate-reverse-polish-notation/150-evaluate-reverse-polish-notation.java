class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        
        for(String s : tokens) {
            if(isOperator(s)) {
                int n2 = st.pop();
                int n1 = st.pop();
                int result = operation(n1, n2, s);
                st.push(result);
            } else {
                st.push(Integer.parseInt(s));
            }
        }
        
        return st.peek();
    }
    
    private boolean isOperator(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
            return true;
        return false;
    }
    
    private int operation(int n1, int n2, String s) {
        if(s.equals("+")) {
            return n1+n2;
        } else if(s.equals("-")) {
            return n1-n2;
        } else if(s.equals("*")) {
            return n1*n2;
        } else if(s.equals("/")) {
            return n1/n2;
        }
        return 0;
    }
}
