class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        uniqueSubsets(nums, 0, new ArrayList<>(), res);
        return res;
    }
    
    private void uniqueSubsets(int[] nums, int index, List<Integer> op, List<List<Integer>> res) {
        if(index == nums.length) {
            res.add(new ArrayList<>(op));
            return;
        }
        List<Integer> op1 = new ArrayList<>(op);
        List<Integer> op2 = new ArrayList<>(op);
        op2.add(nums[index]);
        uniqueSubsets(nums, index+1, op1, res);
        uniqueSubsets(nums, index+1, op2, res);
    }
}