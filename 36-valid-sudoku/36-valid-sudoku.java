class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    char c = board[i][j];
                    if(!set.add(c + " is in row " +i) || !set.add(c + " is in col " +j) || !set.add(c + " is in block " +i/3+"-"+j/3))
                        return false;
                    
                }
            }
        }
        return true;
    }
    

}