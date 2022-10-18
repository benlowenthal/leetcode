class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int out = 0;
        
        for (int i : nums) {
            out ^= i;
        }
        
        return out;
    }
}