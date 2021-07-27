class Solution {
    public int fib(int n) {
        double a =  Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5);
        return (int)Math.round(a);
    }
}