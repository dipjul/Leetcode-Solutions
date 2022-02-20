class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        allSubset(nums, 0, new ArrayList<>(), res);
        return res;
    }
    
    private void allSubset(int[] nums, int index, List<Integer> tmp, List<List<Integer>> res) {
        if(index == nums.length) {
           res.add(new ArrayList<>(tmp));
            return;
        }
        
        // All the subsets that includes nums[index]
        tmp.add(nums[index]);
        allSubset(nums, index+1, tmp, res);
        tmp.remove(tmp.size()-1);
        
        // All the subsets that didn't include nums[index]
        while(index + 1 < nums.length && nums[index] == nums[index+1])
            index++;
        allSubset(nums, index+1, tmp, res);
    }
}