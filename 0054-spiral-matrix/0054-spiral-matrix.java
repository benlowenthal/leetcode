class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        return spiral(matrix);
    }
    
    //recursively take outside numbers and generates list
    private List<Integer> spiral(int[][] matrix) {
        List<Integer> circle = new ArrayList<Integer>();
        
        int m = matrix.length;
        if (m == 0) return circle;
        if (m == 1) {
            for (int c : matrix[0]) circle.add(c);
            return circle;
        }
        
        int n = matrix[0].length;
        if (n == 0) return circle;
        if (n == 1) {
            for (int[] r : matrix) circle.add(r[0]);
            return circle;
        }
        
        for (int c : matrix[0]) circle.add(c); //top
        for (int i = 1; i < m - 1; i++) circle.add(matrix[i][n - 1]); //right
        for (int i = n - 1; i >= 0; i--) circle.add(matrix[m - 1][i]); //bottom
        for (int i = m - 2; i > 0; i--) circle.add(matrix[i][0]); //left
        
        circle.addAll(spiral(cropMatrix(matrix, m, n)));
        
        return circle;
    }
    
    private int[][] cropMatrix(int[][] matrix, int m, int n) {
        int[][] crop = new int[m - 2][n - 2];
        
        for (int i = 1; i < m - 1; i++)
            for (int j = 1; j < n - 1; j++)
                crop[i-1][j-1] = matrix[i][j];
        
        return crop;
    }
}