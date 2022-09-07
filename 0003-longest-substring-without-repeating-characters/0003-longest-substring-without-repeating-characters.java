class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int len = 0;
        int seqStart = 0;
        
        for (int idx = 0; idx < s.length(); idx++){
            char c = s.charAt(idx);
            while (set.contains(c)){
                set.remove(s.charAt(seqStart));
                seqStart++;
            }
            set.add(c);
            
            if (set.size() > len) {
                len = set.size();
            }
        }
        
        return len;
    }
}