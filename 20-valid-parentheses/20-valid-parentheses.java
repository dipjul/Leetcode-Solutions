class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c:s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[')
                st.push(c);
            if(c == ')') {
                if(st.empty() || st.peek() != '(')
                    return false;
                st.pop();
            }
            if(c == '}') {
                if(st.empty() || st.peek() != '{')
                    return false;
                st.pop();
            }
            if(c == ']') {
                if(st.empty() || st.peek() != '[')
                    return false;
                st.pop();
            }
        }
        return st.empty();
    }
}