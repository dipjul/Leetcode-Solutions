class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> resSet = new HashSet<>();
        Arrays.sort(nums);
        allSubset(nums, 0, new ArrayList<>(), resSet);
        for(List<Integer> list : resSet) {
            res.add(list);
        }
        return res;
    }
    
    private void allSubset(int[] nums, int index, List<Integer> tmp, Set<List<Integer>> resSet) {
        if(index == nums.length) {
            resSet.add(new ArrayList<>(tmp));
            return;
        }
        
        allSubset(nums, index+1, tmp, resSet);
        List<Integer> op2 = new ArrayList<>(tmp);
        op2.add(nums[index]);
        allSubset(nums, index+1, op2, resSet);
    }
}