class Solution {
    public int[] plusOne(int[] digits) {
        
        boolean extend = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            
            if (digits[i] != 10) break;
            
            if (i == 0) extend = true;
            
            digits[i] = 0;
        }
        
        if (extend) {
            int[] out = new int[digits.length + 1];
            System.arraycopy(digits, 0, out, 1, digits.length);
            out[0] = 1;
            return out;
        }
        
        return digits;
    }
}