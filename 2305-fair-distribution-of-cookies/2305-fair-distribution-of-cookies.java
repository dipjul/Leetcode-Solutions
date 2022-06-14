class Solution {
    int fair;
    public int distributeCookies(int[] cookies, int k) {
        fair = Integer.MAX_VALUE;
        int[] arr = new int[k];
        return backtrack(0, arr, cookies);
        // return fair;
    }
    
    private int backtrack(int i, int[] arr, int[] cookies) {
        if(i == cookies.length) {
            int max = Integer.MIN_VALUE;
           for(int k = 0; k < arr.length; k++) {
               max = Math.max(max, arr[k]);
           }
            fair = Math.min(fair, max);
            return fair;
        }
        int min = Integer.MAX_VALUE;
        for(int j = 0; j < arr.length; j++) {
            arr[j]+=cookies[i];
            min = Math.min(min, backtrack(i+1, arr, cookies));
            arr[j]-=cookies[i];
        }
        return min;
    }
}
// (i,j)->val