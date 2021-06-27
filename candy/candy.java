class Solution {
    public int candy(int[] ratings) {
        int candy = 0, n = ratings.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i=0;i<n;i++) {
            left[i] = 1;
            right[i] = 1;
        }
        
        for(int i = 1; i < n;i++) {
            if(ratings[i-1]<ratings[i]) {
               left[i] = left[i-1] + 1;
            }
        }
        

        for(int i = n-2; i >= 0;i--) {
            if(ratings[i+1]<ratings[i]) {
              right[i] = right[i+1] + 1;
            }
        }
        
        for(int i=0;i<n;i++) {
            candy+=Math.max(left[i], right[i]);
        }
        
        return candy;
    }
}