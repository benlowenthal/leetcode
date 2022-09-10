class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x)).reverse();
        
        if (x < 0) {
            sb.deleteCharAt(sb.length() - 1);
            sb.insert(0, '-');
        }
        
        long l = Long.parseLong(sb.toString());
        if (l >= Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
            return 0;
        }
        
        return Integer.parseInt(sb.toString());
    }
}