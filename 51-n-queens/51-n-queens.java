class Solution {
    public List<List<String>> solveNQueens(int n) {
        Set<Integer> col = new HashSet<>();
        Set<Integer> negDia = new HashSet<>(); // r-c
        Set<Integer> posDia = new HashSet<>(); // r+c
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        backtrack(0, n, col, negDia, posDia, board, res);
        return res;
    }
    
    private void backtrack(int i, int n, Set<Integer> col, Set<Integer> negDia, Set<Integer> posDia,  char[][] board, List<List<String>> res) {
        if(i == n) {
            res.add(construct(board));
            return;
        }
        for(int j = 0; j < n; j++) {
            if(col.contains(j) || negDia.contains(i-j) || posDia.contains(i+j))
                continue;
            col.add(j);
            negDia.add(i-j);
            posDia.add(i+j);
            board[i][j] = 'Q';
            
            backtrack(i+1, n, col, negDia, posDia, board, res);
            col.remove(j);
            negDia.remove(i-j);
            posDia.remove(i+j);
            board[i][j] = '.';
        }
    }
    
    private List<String> construct(char[][] cArr) {
        List<String> result = new ArrayList<>();
        
        for(int i = 0; i < cArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < cArr[i].length; j++) {
                sb.append(cArr[i][j]);
            }
            result.add(sb.toString());
        }
        return result;
    }
}