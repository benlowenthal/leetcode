class Solution {
    public double myPow(double x, int n) {
        if (x == 0) return 0f;
        if (n == 0 || x == 1) return 1f;
        if (x == -1) return (n % 2 == 0) ? 1f : -1f;
        if (n == Integer.MIN_VALUE) return 0f;
        
        double total = 1;
        
        for (int i = Math.abs(n); i > 0; i /= 2) {
            if (i % 2 == 1)
                total *= x;
            x *= x;
        }
        
        return (n < 0) ? 1f / total : total;
    }
}