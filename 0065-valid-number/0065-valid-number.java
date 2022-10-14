class Solution {
    public boolean isNumber(String s) {
        if (s.length() == 0) return false;
        
        String[] arr = s.split("e", 2);
        
        if (arr.length != 2)
            arr = s.split("E", 2);
        
        if (arr.length == 2)
            return (isDecimal(arr[0]) || isInteger(arr[0])) && isInteger(arr[1]);
        
        return isDecimal(s) || isInteger(s);
    }
    
    private boolean isDecimal(String s) {
        if (s.length() < 2) return false;
        
        int minLength = 0;
        
        int start = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            start = 1;
            minLength++;
        }
        
        boolean dotFound = false;
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '.') {
                if (dotFound) return false;
                dotFound = true;
                minLength++;
            }
            
            else if (c - '0' > 9 || c - '0' < 0)
                return false;
        }
        
        return dotFound && s.length() > minLength;
    }
    
    private boolean isInteger(String s) {
        if (s.length() == 0) return false;
        
        int minLength = 0;
        
        int start = 0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
            start = 1;
            minLength++;
        }
        
        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c - '0' > 9 || c - '0' < 0)
                return false;
        }
        
        return s.length() > minLength;
    }
}