class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int k = 1;
        for (int n : nums) {
            if (n > nums[k - 1])
                nums[k++] = n;
        }
        return k;
    }
}