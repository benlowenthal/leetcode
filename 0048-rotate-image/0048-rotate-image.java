class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int temp;
        
        //flip on x=y
        for (int r = 0; r < rows; r++) {
            for (int c = r + 1; c < cols; c++) {
                temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        
        //flip on y=size/2
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols / 2; c++) {
                temp = matrix[r][c];
                matrix[r][c] = matrix[r][cols - c - 1];
                matrix[r][cols - c - 1] = temp;
            }
        }
    }
}