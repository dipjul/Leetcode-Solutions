class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n;j++) {
                int k = j+1;
                while(k<n && nums[i] + nums[j] > nums[k]) {
                    k++;
                }
                count = count + (k-1)-j;
            }
        }
        return count;
    }
}