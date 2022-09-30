class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> idx = new ArrayList<>();
        
        int m = matrix[0].length;
        for (int i = 0; i < matrix.length * m; i++)
            if (matrix[i/m][i%m] == 0)
                idx.add(i);
        
        for (int id : idx)
            setZeros(matrix, id/m, id%m);
    }
    
    //set row and column to zero
    private void setZeros(int[][] matrix, int i, int j) {
        for (int x = 0; x < matrix.length; x++) matrix[x][j] = 0;
        for (int y = 0; y < matrix[0].length; y++) matrix[i][y] = 0;
    }
}