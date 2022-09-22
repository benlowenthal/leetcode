class Solution {
    public int lengthOfLastWord(String s) {
        int wordStart = -1;
        int wordEnd = -1;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (wordEnd != -1) {
                    wordStart = i;
                    break;
                }
            } else if (wordEnd == -1)
                wordEnd = i;
        }
        
        return wordEnd - wordStart;
    }
}