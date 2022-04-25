class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = piles[0];
        for(int pile : piles) {
            if(pile < left)
                left = pile;
            if(pile > right)
                right = pile;
        }
        int result = right;
        while(left <= right) {
            int mid = left + (right-left)/2;
            if(isSatisfy(piles, mid, h)) {
                result = Math.min(result, mid);
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return result;
    }
    
    private boolean isSatisfy(int[] piles, int mid, int h) {
        int count = 0;
        for(int pile : piles) {
            count += (pile/mid);
            if(pile%mid != 0)
                count++;
        }
        return count <= h;
    }
}