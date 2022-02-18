class Solution {
    public int trap(int[] height) {
        // Approach: Two pointer
        int left = 0, right = height.length-1, ans = 0, leftMax = 0, rightMax = 0;
        // leftmax to track max from 0 to i & rightmax to track max from n to i
        while(left < right) {
            
            if(height[left] <= height[right]) {
                // it'll make sure leftMax - height[left] is vaild
                if(height[left] > leftMax)
                    leftMax = height[left];
                else
                    ans += leftMax-height[left];
                left++;
            } else {
                // it'll make sure rightMax - height[right] is vaild
                if(height[right] > rightMax)
                    rightMax = height[right];
                else
                    ans += rightMax-height[right];
                right--;
            }
        }
        return ans;
    }
}