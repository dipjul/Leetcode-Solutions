class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int ptr1 = 0;
        int ptr2 = nums.length-1;
        int i = nums.length-1;
        while(ptr1 <= ptr2) {
            int num1 = nums[ptr1]*nums[ptr1];
            int num2 = nums[ptr2]*nums[ptr2];
            
            if(num1 > num2) {
                result[i--] = num1;
                ptr1++;
            } else {
                result[i--] = num2;
                ptr2--;
            }
        }
        return result;
    }
}