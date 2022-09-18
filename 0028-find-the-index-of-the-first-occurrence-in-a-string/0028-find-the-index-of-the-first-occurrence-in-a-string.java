class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == 0) return -1;
        if (needle.length() == 0) return 0;
        
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                //next character not next in needle
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
                
                //end of needle reached
                if (j == needle.length() - 1) return i;
                
                //otherwise continue and check next char
            }
        }
        
        return -1;
    }
}