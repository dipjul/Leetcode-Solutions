class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int wS = 0, s = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        for (int wE = 0; wE < nums.length; wE++) {
            if(!q.isEmpty() && q.peek() <= wE-k)
                q.poll();
            
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[wE])
                q.pollLast();
            q.offer(wE);
            if(wE >= k-1)
                res[s++] = nums[q.peek()];
        }
        return res;
    }
}