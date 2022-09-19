class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[j] != nums[i]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            
            else i++;
        }
        
        int seq = 0;
        
        while (seq < nums.length && nums[seq] == seq + 1)
            seq++;
        
        return seq + 1;
    }
}