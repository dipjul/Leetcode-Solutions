class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int start = 1;
        if(n%2 == 0) {
            for(int i=n/2-1,j=n/2;i>=0;i--,j++) {
                res[i] = start++;
                res[j] = res[i]*-1;
            }
        } 
        else {
            res[n/2] = 0;
            for(int i=n/2-1,j=n/2+1;i>=0;i--,j++) {
                res[i] = start++;
                res[j] = res[i]*-1;
            }
        }
        return res;
    }
}