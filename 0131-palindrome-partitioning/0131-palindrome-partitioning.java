class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> out = new ArrayList<>();
        parts(s, 0, new ArrayList<>(), out);
        return out;
    }
    
    private void parts(String s, int ptr, List<String> curr, List<List<String>> out) {
        if (ptr == s.length())
            out.add(new ArrayList<>(curr));
        
        else for (int i = 1; i < s.length() - ptr + 1; i++) {
            if (palindrome(s.substring(ptr, ptr + i))) {
                curr.add(s.substring(ptr, ptr + i));
                parts(s, ptr + i, curr, out);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    private boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++)
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
            
        return true;
    }
}