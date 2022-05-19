class Solution {
    
    public int longestIncreasingPath(int[][] matrix) {
        boolean[][] mark = new boolean[matrix.length][matrix[0].length];
        int[][] cache = new int[matrix.length][matrix[0].length];
        int res = 1;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++)
                res = Math.max(res, backtrack(matrix, i, j, mark, -1, cache));
        }
        return res;
    }
    
    private int backtrack(int[][] matrix, int i, int j, boolean[][] mark, int prev, int[][] cache) {
        if(i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || mark[i][j] || prev >= matrix[i][j]) {
            return 0;
        }
        if(cache[i][j] != 0)
            return cache[i][j];
        int max = 1, len = 0;
        mark[i][j] = true;
        if(i >= 0)
           len = Math.max(len, 1 + backtrack(matrix, i-1, j, mark, matrix[i][j], cache));
        if(j >= 0)
            len = Math.max(len, 1 + backtrack(matrix, i, j-1, mark, matrix[i][j], cache));
        if(i < matrix.length)
            len = Math.max(len, 1 + backtrack(matrix, i+1, j, mark, matrix[i][j], cache));
        if(j < matrix[0].length)
            len = Math.max(len, 1 + backtrack(matrix, i, j+1, mark, matrix[i][j], cache));
        mark[i][j] = false;
        max = Math.max(max, len);
        cache[i][j] = max;
        return max;
    }
}