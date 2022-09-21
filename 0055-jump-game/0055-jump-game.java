class Solution {
    public boolean canJump(int[] nums) {
        //track maximum position we can reach
        int max = 0;
        
        //iterate nums within max reach
        for (int i = 0; i < nums.length - 1 && i <= max; i++)
            if (i + nums[i] > max)
                max = i + nums[i];
        
        return max >= nums.length - 1;
    }
}