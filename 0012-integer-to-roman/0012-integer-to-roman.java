class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        
        char[] units = new char[] {'I', 'X', 'C', 'M'};
        char[] fives = new char[] {'V', 'L', 'D'};
        
        for (int idx = String.valueOf(num).length() - 1; idx >= 0; idx--) {
            int pow = (int) Math.pow(10, idx);
            
            if (num / pow < 4) {
                sb.append(String.valueOf(units[idx]).repeat(num / pow)); 
            } else if (num / pow == 9) {
                sb.append(String.valueOf(units[idx]) + String.valueOf(units[idx+1]));
            } else if (num / pow > 4) {
                sb.append(String.valueOf(fives[idx]) + String.valueOf(units[idx]).repeat((num / pow) - 5));
            } else if (num / pow == 4) {
                sb.append(String.valueOf(units[idx]) + String.valueOf(fives[idx]));
            }
            
            num = num % pow;
        }
        
        return sb.toString();
    }
}