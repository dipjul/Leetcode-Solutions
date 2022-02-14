class Solution {
    
    public double myPow(double x, int n) {
        if(n == -1)
            return 1/x;
        if(n == 0)
            return 1;
        if(n%2==0) {
            return myPow(x*x, n/2);
        }
        else {
            if(n < 0)
                return 1/x*myPow(x*x, n/2);
            return x*myPow(x*x, n/2);
        }
    }
    
    /*
    public double myPow(double x, int n) {
        if(n == -1) {
            return 1/x;
        }
        if(n == 0)
            return 1;

        if(n % 2 == 0) { 
            double d = myPow(x, n/2);
            return d*d;
        } else {
            double d = myPow(x, n/2);
            if(n < 0)
                return 1/x * d * d;
            return x*d*d;
        }
    } */
}