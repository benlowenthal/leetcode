class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for (int idx = 0; idx <= s.length() / 2; idx++) {
            if (s.charAt(idx) != s.charAt(s.length() - idx - 1)) {
                return false;
            }
        }
        return true;
    }
}