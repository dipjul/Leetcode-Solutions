class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> lst = new ArrayList<>();
        int open = n;
        int close = n;
        String op = "";
        solve(open, close, op, lst);
        return lst;
    }
    
    private void solve(int open, int close, String op, List<String> lst) {
        if(open == 0 && close == 0) {
            lst.add(op);
            return;
        }
        if(open != 0) {
            String op1 = op + "(";
            solve(open-1, close, op1, lst);
        }
        if(close > open) {
            String op2 = op + ")";
            solve(open, close-1, op2, lst);
        }
        return;
    }
}