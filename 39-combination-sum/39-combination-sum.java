class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<Integer>(), res);
        return res;
    }
    
    private void backtrack(int[] nums, int index, int target, List<Integer> tmp, List<List<Integer>> res) {
        if(target < 0)
            return;
        else if(target == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        
        for(int i = index; i < nums.length; i++) {
            tmp.add(nums[i]);
            backtrack(nums, i, target-nums[i], tmp, res);
            tmp.remove(tmp.size()-1);
            
        }       
    }
}