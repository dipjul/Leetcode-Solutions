class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] P = new int[m];
        int[] result = new int[queries.length];
        for(int i=1;i<=m;i++) {
            P[i-1] = i;
        }
        for(int i=0;i<queries.length;i++) {
            result[i] = doProcessing(queries, i, P);
        }
        return result;
    }
    
    private int doProcessing(int[] Q, int i, int[] P) {
        int res =-1;
        int tmp = Q[i];
        for(int j=0;j<P.length;j++) {
            if(P[j] == Q[i]) {
                res = j;
                break;
            }
        }
        for(int j=res;j > 0;j--) {
            P[j] = P[j-1];
        }
        P[0] = tmp;
        // printArr(P);
        return res;
    }
    
    // private void printArr(int[] arr) {
    //     for(int i=0;i<arr.length;i++){
    //         System.out.print(arr[i]);
    //     }
    //     System.out.println(" ");
    // }
}