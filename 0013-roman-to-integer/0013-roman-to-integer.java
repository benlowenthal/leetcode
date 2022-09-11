class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );
        
        int total = 0;
        int previous = 0;
        
        //work backwards through string
        for (int idx = s.length() - 1; idx >= 0; idx--) {
            int val = map.get(s.charAt(idx));
            
            if (val < previous) total -= val;
            else total += val;
            
            previous = val;
        }
        
        return total;
    }
}