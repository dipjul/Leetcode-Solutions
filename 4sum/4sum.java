class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> quads = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-3; i++) {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            
            for(int j = i + 1; j < nums.length-2; j++) {
                if(j > i + 1 && nums[j] == nums[j-1])
                    continue;
                search(nums, target, i, j, quads);
            }
        }
        return quads;
    }
    
    private void search(int[] arr, int target, int first, int second, List<List<Integer>> quads) {
        int left = second+1;
        int right = arr.length-1;
        
        while(left < right) {
            int sum = arr[first] + arr[second] + arr[left] + arr[right];
            
            if(sum == target) {
                quads.add(Arrays.asList(arr[first], arr[second], arr[left], arr[right]));
                left++;
                right--;
                while(left < right && arr[left] == arr[left-1])
                    left++;
                while(left < right && arr[right] == arr[right+1])
                    right--;
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}