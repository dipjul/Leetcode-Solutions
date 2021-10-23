class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList();
        
        for(int i = 0; i < nums.length-2; i++) {
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            search(nums, -nums[i], i+1, triplets);
        }
        return triplets;
    }
    
    private void search(int[] arr, int targetSum, int left, List<List<Integer>> triplets) {
        int right = arr.length-1;
        
        while(left < right) {
            int currentSum = arr[left]+arr[right];
            if(currentSum == targetSum) {
                triplets.add(Arrays.asList(-targetSum, arr[left], arr[right]));
                left++;
                right--;
                while(left < right && arr[left] == arr[left-1])
                    left++;
                while(left < right && arr[right] == arr[right+1])
                    right--;
            } else if(targetSum > currentSum)
                left++;
            else
                right--;
        }
    }
}