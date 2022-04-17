class Solution {
    public int maxArea(int[] height) {
        int area = 0, maxArea = 0;
        int left = 0, right = height.length-1;
        
        while(left < right) {
            area = Math.min(height[left], height[right])*(right-left);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
    }
}