class Solution {
    public boolean circularArrayLoop(int[] nums) {
        
        for(int i = 0; i < nums.length; i++) {
            int slow = i, fast = i;
            boolean isForward = nums[i] >= 0;
            do {
                slow = findNext(nums, isForward, slow);
                fast = findNext(nums, isForward, fast);
                if(fast != -1) {
                    fast = findNext(nums, isForward, fast);
                }
            } while( slow != -1 && fast != -1 && slow != fast);
            
            if(slow != -1 && slow == fast)
                return true;
        }
        return false;
    }
    
    public int findNext(int[] arr, boolean isForward, int currentIndex) {
        boolean direction = arr[currentIndex] >= 0;
        
        if(direction != isForward)
            return -1;
        
        int nextInd = (currentIndex + arr[currentIndex]) % arr.length;
        
        if(nextInd < 0)
            nextInd += arr.length;
        if(nextInd == currentIndex)
            nextInd = -1;
        
        return nextInd;
    }
}