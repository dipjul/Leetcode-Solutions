class Solution {
    int[] row;
    boolean[] rw, ld, rd;

    public int totalNQueens(int n) {
        row = new int[n];
        rw = new boolean[2 * n - 1];
        ld = new boolean[2 * n - 1];
        rd = new boolean[2 * n - 1];
        int[] res = { 0 };
        backtrack(0, n, res);
        return res[0];
    }

    private void backtrack(int c, int n, int[] res) {
        if (c == n) {
            res[0]++;
            return;
        }
        for (int r = 0; r < n; r++) {
            if (!rw[r] && !ld[r + c] && !rd[r - c + n - 1]) {
                rw[r] = ld[r + c] = rd[r - c + n - 1] = true;
                backtrack(c + 1, n, res);
                rw[r] = ld[r + c] = rd[r - c + n - 1] = false;
            }
        }
    }
}
