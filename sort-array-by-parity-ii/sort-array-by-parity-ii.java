class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even[] = new int[nums.length/2+1];
        int odd[] = new int[nums.length/2+1];
        int j = 0, k = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]%2==0) even[j++] = nums[i];
            else odd[k++] = nums[i];
        }
        for(int i=0;i<nums.length;i++) {
            if(i%2==0) nums[i]=even[i/2];
            else nums[i]=odd[i/2];
        }
        return nums;
    }
}