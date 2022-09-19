class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> validPosition = new HashSet<>();
        Set<String> validBlock = new HashSet<>();
        
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] != '.') {
                    //try add to set, returns false if value already there
                    boolean x = validPosition.add(String.format("%s:%d r", board[row][col], row));
                    boolean y = validPosition.add(String.format("%s:%d c", board[row][col], col));
                    boolean z = validBlock.add(String.format("%s:%d,%d", board[row][col], row/3, col/3));
                    
                    if (!(x && y && z)) return false;
                }
            }
        }
        
        return true;
    }
}