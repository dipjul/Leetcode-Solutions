class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
            mp.put(nums[i],i);
        for(int[] op : operations) {
            int ind = mp.get(op[0]);
            nums[ind] = op[1];
            mp.put(op[1], ind);
        }
        return nums;
    }
}