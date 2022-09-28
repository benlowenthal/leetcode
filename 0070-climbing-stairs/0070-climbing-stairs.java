class Solution {
    public int climbStairs(int n) {
        if (n == 0) return 0;
        
        int[] f = fibonacci(n);
        return f[n];
    }
    
    private int[] fibonacci(int n) {
        int[] seq = new int[n + 1];
        seq[0] = 1;
        seq[1] = 1;
        
        for (int i = 2; i <= n; i++)
            seq[i] = seq[i - 1] + seq[i - 2];
        
        return seq;
    }
}