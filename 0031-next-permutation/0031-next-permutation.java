class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length < 2) return;
        
        if (nums.length == 2) {
            nums = swap(nums, 0, 1);
            return;
        }
        
        int start = nums.length - 2;
        while (start >= 0 && nums[start] >= nums[start+1]) start--;
        
        int end = nums.length - 1;
        
        //if valid start found swap it to a valid end
        //if valid start not found we reverse entire array
        if (start >= 0) {
            while (nums[end] <= nums[start]) end--;
            nums = swap(nums, start, end);
        }
        
        //reverse list in range
        for (int i = 0; i < (nums.length - start) / 2; i++) {
            nums = swap(nums, start + i + 1, nums.length - i - 1);
        }
    }
    
    private int[] swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
        return nums;
    }
}