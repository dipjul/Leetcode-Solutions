class Solution {
    public int jump(int[] nums) {
        if(nums.length<=1)
            return 0;
        int ladder = nums[0]; //keep track of largest ladder that you have
        int stairs = nums[0]; //keep track of stairs in current ladder
        
        int jump = 1;
        
        for(int level = 1; level < nums.length; level++) {
            if(level == nums.length - 1)
                return jump;
            if(level + nums[level] > ladder) {
                ladder = level + nums[level]; //build up the ladder
            }
            stairs--; //use up the stairs
            if(stairs == 0) {
                jump++; //no stairs left,so jump now
                stairs = ladder - level; //get the new sets of stairs
            }
        }
        return jump;
    }
}