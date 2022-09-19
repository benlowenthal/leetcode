class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        
        int seq = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] != seq) {
                if (nums[i] == seq + 1) seq++;
                else break;
            }
        }
        
        return seq + 1;
    }
}