class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int n = matrix.length, m = matrix[0].length;
        // first column
        for(int i = 0; i < n; i++) {
            if(matrix[i][0] == 0)
                col0 = 0;
        }
        // first row
        for(int i = 0; i < m; i++) {
            if(matrix[0][i] == 0)
                matrix[0][0] = 0;
        }
        // starting from (1,1)
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }
        
        if(matrix[0][0] == 0) {
            for(int i = 1; i < m; i++)
                matrix[0][i] = 0;
        }
        
        if(col0 == 0) {
            for(int i = 0; i < n; i++)
                matrix[i][0] = 0;
        }
    }
}

/*
[1, 1, 1] -> cols matrix[0][] -> [1, 0, 1]
[1, 0, 1]
[1, 1, 1]

row0 = 1
 rows matrix[][0] ->[0, 1]
matrix[][0] 
matrix[i][j] == 0
matrix[0][j] = 0
matrix[i][0] = 0
matrix[i][0] || matrix[0][j] ==0 matrix[i][j] = 0
*/