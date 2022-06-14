class Solution {
    int fair;
    public int distributeCookies(int[] cookies, int k) {
        fair = Integer.MAX_VALUE;
        int[] arr = new int[k];
        backtrack(0, arr, cookies);
        return fair;
    }
    
    private void backtrack(int i, int[] arr, int[] cookies) {
        if(i == cookies.length) {
            int max = Integer.MIN_VALUE;
           for(int k = 0; k < arr.length; k++) {
               max = Math.max(max, arr[k]);
           }
            fair = Math.min(fair, max);
            return;
        }
        
        for(int j = 0; j < arr.length; j++) {
            arr[j]+=cookies[i];
            backtrack(i+1, arr, cookies);
            arr[j]-=cookies[i];
        }
        
    }
}