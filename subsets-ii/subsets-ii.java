class Solution {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList();
        List<Integer> step = new ArrayList();
        helper(nums, 0, step, result);
        return result;
    }
    
    private void helper(int[] nums, int pos,List<Integer> step, List<List<Integer>> result) {
        
        if(pos <= nums.length)
            result.add(new ArrayList(step));
        
        for(int i = pos; i < nums.length; i++) {
            if(i > pos && nums[i] == nums[i-1])
                continue;
            step.add(nums[i]);
            helper(nums, i+1, step, result);
            step.remove(step.size()-1);
        }
        
    }
}