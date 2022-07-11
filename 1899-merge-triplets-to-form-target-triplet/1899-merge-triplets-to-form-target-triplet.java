class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        boolean[] mark = new boolean[3];
        
        for(int[] trip : triplets) {
            if(trip[0] <= target[0] && trip[1] <= target[1] && trip[2] <= target[2]) {
                if(trip[0] == target[0])
                    mark[0] = true;
                if(trip[1] == target[1])
                    mark[1] = true;
                if(trip[2] == target[2])
                    mark[2] = true;
            }
            if(mark[0] && mark[1] && mark[2])
                return true;
        }
        return mark[0] && mark[1] && mark[2];
    }
}
/*
[T,T,T]
*/