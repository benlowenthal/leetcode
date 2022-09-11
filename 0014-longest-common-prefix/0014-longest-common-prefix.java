class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        boolean flag = false;
        
        while (!flag && prefix != "") {
            iteration:
            for (String s : strs) {
                if (!s.startsWith(prefix)) {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    break iteration;
                }
                
                if (s == strs[strs.length - 1]) flag = true;
            }
        }
        
        return prefix;
    }
}