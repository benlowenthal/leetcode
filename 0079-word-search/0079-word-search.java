class Solution {
    public boolean exist(char[][] board, String word) {
        int h = board.length;
        int w = board[0].length;
        boolean[][] table;
        
        boolean exists = false;
        
        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {
                if (board[y][x] == word.charAt(0)) {
                    table = new boolean[h][w];
                    
                    exists = exists || valid(board, table, word, 1, x, y);
                    
                    if (exists) return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean valid(char[][] board, boolean[][] table, String word, int ptr, int x, int y) {
        if (ptr == word.length()) return true;
        
        table[y][x] = true;
        
        char next = word.charAt(ptr);
        
        int h = board.length;
        int w = board[0].length;
        boolean b = false;
        if (x+1 < w && board[y][x+1] == next && !table[y][x+1])
            b = b || valid(board, table, word, ptr+1, x+1, y);
        if (x-1 >= 0 && board[y][x-1] == next && !table[y][x-1])
            b = b || valid(board, table, word, ptr+1, x-1, y);
        if (y+1 < h && board[y+1][x] == next && !table[y+1][x])
            b = b || valid(board, table, word, ptr+1, x, y+1);
        if (y-1 >= 0 && board[y-1][x] == next && !table[y-1][x])
            b = b || valid(board, table, word, ptr+1, x, y-1);
        
        table[y][x] = false;
        
        return b;
    }
}