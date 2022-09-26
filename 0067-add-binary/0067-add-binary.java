class Solution {
    public String addBinary(String a, String b) {
        String out = "";
        
        int sum;
        int i = 0;
        int carry = 0;
        while (i < a.length() || i < b.length()) {
            sum = carry;
            if (i < a.length() && a.charAt(a.length() - i - 1) == '1') sum++;
            if (i < b.length() && b.charAt(b.length() - i - 1) == '1') sum++;
            
            out = (sum % 2) + out;
            if (sum > 1) carry = 1;
            else carry = 0;
            
            i++;
        }
        
        if (carry == 1) out = "1" + out;
        
        return out;
    }
}