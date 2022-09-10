import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Solution {
    public boolean isMatch(String s, String p) {
//         int i = 0, j = 0;
        
//         while (i < s.length()) {
//             if (j >= p.length()) {
//                 return false;
//             }
            
//             else if (j < p.length() - 1 && p.charAt(j+1) == '*') {
//                 char match = p.charAt(j);
                
//                 while (i < s.length() && (s.charAt(i) == match || match == '.')) {
//                     i++;
//                 }
                
//                 j += 2;
//             }
            
//             else if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
//                 i++; j++;
//             }
            
//             else return false;
//         }
        
//         return (j == p.length());
        
        Pattern pattern = Pattern.compile(p, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}