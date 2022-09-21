class Solution {
    public boolean canJump(int[] nums) {
        //track maximum position we can reach
        //since jumps can be any length up to that value
        int max = 0;
        
        for (int i = 0; i < nums.length - 1 && i <= max; i++)
            if (i + nums[i] > max)
                max = i + nums[i];
        
        return max >= nums.length - 1;
    }
}