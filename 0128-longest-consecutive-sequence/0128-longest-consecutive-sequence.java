class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        Arrays.sort(nums);
        
        int len = 0;
        int max = 0;
        Integer prev = null;
        for (int x : nums) {
            if (prev == null || x == prev + 1) {
                len++;
                max = Math.max(max, len);
            } else if (x != prev) {
                len = 1;
            }
            
            prev = x;
        }
        
        return max;
    }
}