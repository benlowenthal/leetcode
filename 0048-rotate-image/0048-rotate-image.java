class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        //flip on x=y
        for (int r = 0; r < rows; r++) {
            for (int c = r + 1; c < cols; c++) {
                swap(matrix, r, c, c, r);
            }
        }
        
        //flip on y=size/2
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols / 2; c++) {
                swap(matrix, r, c, r, cols - c - 1);
            }
        }
    }
    
    private void swap(int[][] nums, int x1, int x2, int y1, int y2) {
        int temp = nums[x1][x2];
        nums[x1][x2] = nums[y1][y2];
        nums[y1][y2] = temp;
    }
}