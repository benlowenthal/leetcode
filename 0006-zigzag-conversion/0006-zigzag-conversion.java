class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder(s.length());
        
        //calculate length of one zigzag
        int cycleLength = (numRows * 2) - 2;
        for (int row = 1; row <= numRows; row++) {
            int gap = (numRows * 2) - (row * 2);
            gap = cycleLength - gap;
            
            for (int idx = row - 1; idx < s.length(); idx += gap) {
                sb.append(s.charAt(idx));
                
                //alternate gap length
                gap = cycleLength - gap;
                
                //avoid repeats of same char
                gap = (gap == 0) ? cycleLength : gap;
            }
        }
        
        return sb.toString();
    }
}