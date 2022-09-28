class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        
        while (r < matrix.length && c > -1) {
            if (matrix[r][c] == target) return true;
            
            if (matrix[r][c] > target) c--;
            else r++;
        }
        
        return false;
    }
}