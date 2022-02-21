class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), res);
        return res;
    }
    
    private void backtrack(int[] nums, List<Integer> tmp, List<List<Integer>> res) {
        if(tmp.size()==nums.length) {
            res.add(new ArrayList<>(tmp));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(tmp.contains(nums[i]))
                continue;
            tmp.add(nums[i]);
            backtrack(nums, tmp, res);
            tmp.remove(tmp.size()-1);
        }
    }
}