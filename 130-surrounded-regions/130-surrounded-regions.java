class Solution {
    public void solve(char[][] board) {
        int[][] mark = new int[board.length][board[0].length];
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j, mark);
        }
        for (int j = 0; j < board[0].length; j++) {
            if (board[board.length - 1][j] == 'O')
                dfs(board, board.length - 1, j, mark);
        }
        for (int j = 0; j < board.length; j++) {
            if (board[j][0] == 'O')
                dfs(board, j, 0, mark);
        }
        for (int j = 0; j < board.length; j++) {
            if (board[j][board[0].length - 1] == 'O')
                dfs(board, j, board[0].length - 1, mark);
        }
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(mark[i][j] == 0 && board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }
    }

    private void dfs(char[][] grid, int i, int j, int[][] mark) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || mark[i][j] == 1 || grid[i][j] == 'X')
            return;
        mark[i][j] = 1;
        dfs(grid, i, j - 1, mark);
        dfs(grid, i, j + 1, mark);
        dfs(grid, i - 1, j, mark);
        dfs(grid, i + 1, j, mark);
    }
}