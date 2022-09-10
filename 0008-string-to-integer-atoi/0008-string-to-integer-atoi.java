class Solution {
    public int myAtoi(String s) {
        //remove whitespace
        s = s.trim();
        
        if (s.length() == 0) {
            return 0;
        }
        
        int idx = 0;
        int sign = 1;
        
        if (s.charAt(0) == '-') {
            sign = -1;
            idx++;
        } else if (s.charAt(0) == '+') {
            idx++;
        }
        
        int total = 0;
        for (int i = idx; i < s.length(); i++) {
            //get value of char
            int x = s.charAt(i) - '0';
            
            if (x > 9 || x < 0) {
                break;
            }
            
            if (Integer.MAX_VALUE/10 < total || (Integer.MAX_VALUE/10 == total && x > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            total = total * 10 + x;
        }
        
        return sign * total;
    }
}