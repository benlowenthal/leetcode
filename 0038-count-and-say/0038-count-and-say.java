class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        return convert(countAndSay(n - 1));
    }
    
    private String convert(String s) {
        StringBuilder sb = new StringBuilder();
        
        int next = s.charAt(0) - '0';
        int count = 1;
        int prev = -1;
        
        for (int i = 0; i < s.length(); i++) {
            next = s.charAt(i) - '0';
            
            if (prev == -1) prev = next;
            else if (prev == next) count++;
            else {
                sb.append(String.format("%d%d", count, prev));
                prev = next;
                count = 1;
            }
        }
        
        //append last number chain
        sb.append(String.format("%d%d", count, next));
        
        return sb.toString();
    }
}