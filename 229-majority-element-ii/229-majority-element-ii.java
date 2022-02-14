class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int player1 = Integer.MAX_VALUE, player2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == player1)
                count1++;
            else if(nums[i] == player2)
                count2++;
            else if(count1 == 0) {
                player1 = nums[i];
                count1 = 1;
            } else if(count2 == 0) {
                player2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        
        count1 = 0; count2 = 0;
        for(int num:nums) {
            if(num == player1)
                count1++;
            if(num == player2)
                count2++;
        }
        
        List<Integer> res = new ArrayList<>();
        if(count1 > nums.length/3)
            res.add(player1);
        if(count2 > nums.length/3)
            res.add(player2);
        return res;
    }
}