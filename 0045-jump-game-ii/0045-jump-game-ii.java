class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        
        int pos = 0;
        while (pos < nums.length - 1) {
            int max = 1;
            
            for (int i = 1; i <= nums[pos] && pos + i < nums.length; i++) {
                if (pos + i == nums.length-1) {
                    max = i;
                    break;
                } else if (i + nums[pos + i] > max + nums[pos + max])
                    max = i;
            }
            
            pos += max;
            jumps++;
        }
        
        return jumps;
    }
}