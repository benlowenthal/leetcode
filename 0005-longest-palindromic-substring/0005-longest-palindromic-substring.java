class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        
        for (int idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);
            int next = s.indexOf(c, idx + 1);
            
            while (next != -1) {
                String sub = s.substring(idx, next + 1);
                
                if (sub.length() > longest.length() && checkSubstring(sub)) {
                    longest = sub;
                }
                
                next = s.indexOf(c, next + 1);
            }
        }
        
        return (longest.length() != 0) ? longest : s.substring(0,1);
    }
    
    private boolean checkSubstring(String s) {
        for (int idx = 0; idx <= s.length() / 2; idx++) {
            if (s.charAt(idx) != s.charAt(s.length() - idx - 1)) {
                return false;
            }
        }
        return true;
    }
}