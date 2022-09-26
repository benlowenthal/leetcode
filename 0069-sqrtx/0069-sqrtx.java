class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        
        long y = x;
        
        //iterate toward sqrt(x)
        while (y * y > x) {
		    y = (y + (x / y)) / 2;	
        }
        
        //convert to integer
        return (int) y;
    }
}