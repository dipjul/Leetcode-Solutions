class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            if(!mp.containsKey(nums[i]))
                mp.put(nums[i],1);
            else
                mp.put(nums[i],mp.get(nums[i])+1);
        }
        for(int key:mp.keySet()) {
            if(mp.get(key) == 1)
                sum+=key;
        }
        return sum;
    }
}