class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int sr = 0, sc = 0;
        int i = sr, j = sc;
        while (sc <= n || sr <= m) {

            // 1st row
            while (j <= n) {
                res.add(matrix[i][j]);
                j++;
            }
            sr++;
            j = n;
            i = sr;

            // TODO: condition
            if (i > m || j > n) {
                break;
            }
            // last colunm
            while (i <= m) {
                res.add(matrix[i][j]);
                i++;
            }
            n--;
            i = m;
            j = n;

            if (i > m || j > n) {
                break;
            }

            // last row
            while (j >= sc) {
                res.add(matrix[i][j]);
                j--;
            }
            m--;
            j = sc;
            i = m;

            if (i > m || j > n) {
                break;
            }
            // 1st column
            while (i >= sr) {
                res.add(matrix[i][j]);
                i--;
            }
            sc++;
            i = sr;
            j = sc;

            if (i > m || j > n) {
                break;
            }
        }
        return res;
    }
}