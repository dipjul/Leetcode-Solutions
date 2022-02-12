class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = 0;
        for(i = n-1; i > 0; i--) {
            if(nums[i] > nums[i-1])
                break;
        }
        
        if(i == 0){
            reverse(nums, 0, n-1);
            return;
        }
        int prev = i-1;
        int nextGreater = n-1;
        for(int j = n-1; j > prev; j--) {
            if(nums[j]>nums[prev]) {
                nextGreater = j;
                break;
            }
        }
        swap(nums, prev, nextGreater);
        reverse(nums, prev+1, n-1);
            
        
    }
    
    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    private void reverse(int[] arr, int i, int j) {
        while(i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}


























//     public void nextPermutation(int[] nums) {
//         int i = nums.length-2;
//         while(i >= 0 && nums[i+1] <= nums[i])
//             i--;
        
//         if(i >= 0) {
//             int j = nums.length-1;
//             while(nums[j] <= nums[i])
//                 j--;
//             swap(nums, i, j);
//         }
//         reverse(nums, i+1);
//     }
    
//     private void reverse(int[] arr, int start) {
//         int i = start, j = arr.length-1;
//         while(i < j) {
//             swap(arr, i, j);
//             i++;
//             j--;
//         }
//     }
    
//     private void swap(int[] arr, int i, int j) {
//         int t = arr[i];
//         arr[i] = arr[j];
//         arr[j] = t;
//     }
// }

/*

1 2 3 10 9 8 7
0 1 2 3  4 5 6
start from end & break when we find non-increasing 
i = 3 -> 10
i - 1 = 2 -> 30
swap i-1 with n - 1
1 2 7 10 9 8 3
0 1 2 3  4 5 6
swap[ i++ with n--]
1 2 7 3 8 9 10
0 1 2 3  4 5 6
*/