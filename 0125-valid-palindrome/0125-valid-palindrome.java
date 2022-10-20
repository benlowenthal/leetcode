class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            //punctuation
            char x = s.charAt(i);
            char y = s.charAt(j);
            
            boolean xIsNum = x>47 && x<58;
            boolean yIsNum = y>47 && y<58;
            
            if (!(xIsNum || (x>64 && x<91) || (x>96 && x<123))) i++;
            else if (!(yIsNum || (y>64 && y<91) || (y>96 && y<123))) j--;
            
            else if (x == y || (!xIsNum && !yIsNum && (x+32 == y || x == y+32))) {
                i++;
                j--;
            }
            
            else return false;
        }
        
        return true;
    }
}