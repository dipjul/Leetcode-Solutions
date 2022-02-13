class Solution {
    
    public void rotate(int[][] matrix) {
        transpose(matrix);
        
        for(int[] arr:matrix) {
            reverse(arr);
        }
    }
    
    private void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i + 1; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }
    
    private void reverse(int[] arr) {
        for(int i = 0, j = arr.length-1; i <= j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
    
    
    
    
    
    /*
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int[] arr:matrix) {
            reverse(arr);
        }
    }
    
    private void transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = i+1; j < matrix[i].length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        

    }
    
    private void reverse(int[] arr) {
        for(int i = 0, j = arr.length-1; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
*/    
    // private void display(int[][] matrix) {
    //     for(int i = 0; i < matrix.length; i++) {
    //         for(int j = 0; j < matrix.length; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    // }
// }

/*

1 2 3               1 4 7               7 4 1
4 5 6 - transpose-> 2 5 8 - reverse ->  8 5 2
7 8 9               3 6 9               9 6 3

*/