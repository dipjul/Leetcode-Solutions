class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        int max = 0;
        int[] count = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--) {
            
            while(i >= 0 && !st.empty() && nums[st.peek()] < nums[i]) {
                int top = st.pop();
                count[i]++;
                count[i] = Math.max(count[i], count[top]);
                max = Math.max(count[i], max);
            }
            st.push(i);
        }
        return max;
    }
}
/*

[10,1,2,3,4,5,6,1,2,3]
[10]
count = 6, max = 6
*/