class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[] res = new boolean[1];
        boolean[][] mark = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    backtrack(board, word, mark, i, j, res);
                    if(res[0] == true)
                        return true;
                }
            }
        }
        return false;
    }
    
    private void backtrack(char[][] board, String word, boolean[][] mark, int i, int j, boolean[] res) {
        if (word.length() == 0) {
            res[0] = true;
            return;
        }
        if (i >= board.length || j >= board[0].length || i < 0 || j < 0 || mark[i][j])
            return;

        if (word.charAt(0) == board[i][j]) {
            mark[i][j] = true;
            if (i >= 0) {
                backtrack(board, word.substring(1), mark, i - 1, j, res);
            }
            if (j >= 0) {
                backtrack(board, word.substring(1), mark, i, j - 1, res);
            }
            if (i < board.length) {
                backtrack(board, word.substring(1), mark, i + 1, j, res);
            }
            if (j < board[0].length) {
                backtrack(board, word.substring(1), mark, i, j + 1, res);
            }
            mark[i][j] = false;
        }
    }
}