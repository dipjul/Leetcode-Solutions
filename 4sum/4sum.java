class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length-3; i++) {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            for(int j = i + 1; j < nums.length-2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1])
                    continue;
                search(nums, target, i, j, result);
            }
        }
        return result;
    }
    
    private void search(int[] nums, int target, int first, int second, List<List<Integer>> result) {
        int left = second + 1, right = nums.length-1;
        while(left < right) {
            int sum = nums[first] + nums[second] + nums[left] + nums[right];
            if(sum == target) {
                result.add(Arrays.asList(nums[first], nums[second], nums[left], nums[right]));
                left++;
                right--;
                while(left < right && nums[left]==nums[left-1])
                    left++;
                while(left < right && nums[right]==nums[right+1])
                    right--;
            }
            else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}