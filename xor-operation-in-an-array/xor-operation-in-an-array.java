class Solution {
    public int xorOperation(int n, int start) {
        int a[] = new int[n];
        int result = 0;
        for(int i=0;i<n;i++) {
            a[i] = start + 2*i;
            result ^= a[i];
        }
        return result;
    }
}