class Solution {
    public void setZeroes(int[][] matrix) {
        int row0 = 1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(i == 0 && matrix[0][j] == 0) {
                    row0 = 0;
                }
                else if(matrix[i][j] == 0) {
                    matrix[i][0] = 0; // sets values in the first column
                    matrix[0][j] = 0; // sets values in the first row
                }
            }
        }
        
        for(int i = 1; i < matrix.length; i++) {
            for(int j = 1; j < matrix[0].length; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        if(matrix[0][0] == 0) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
        
        if(row0 == 0) {
            for(int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}