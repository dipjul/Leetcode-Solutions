class Solution {
    public int kthGrammar(int n, int k) {
        return solve(n, k);
    }
    
    private int solve(int n, int k) {
        if(n == 1 && k == 1)
            return 0;
        int mid = (int)Math.pow(2, n-2);
        if(k <= mid)
            return solve(n-1, k);
        else
            return 1^solve(n-1, k-mid);
    }
}