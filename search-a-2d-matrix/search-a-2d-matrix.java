class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        int low = 0, high = n*m-1;
        
        while(low <= high) {
            int mid = low + (high-low)/2;
            int val = matrix[mid/m][mid%m];
            if(val == target)
                return true;
            else if(val < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return false;
    }
    
    

}