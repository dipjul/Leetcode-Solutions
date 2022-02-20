class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        combination(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }
    
    private void combination(int[] nums, int index, int target, List<Integer> tmp, List<List<Integer>> res) {
        if(target < 0)
            return;
        else if(target == 0) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i = index; i < nums.length; i++) {
            if(i > index && nums[i] == nums[i-1])
                continue;
            tmp.add(nums[i]);
            combination(nums, i+1, target-nums[i], tmp, res);
            tmp.remove(tmp.size()-1);
        }
    }
}