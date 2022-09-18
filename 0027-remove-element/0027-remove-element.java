class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        
        int k = 0;
        for (int n : nums) {
            if (n != val)
                nums[k++] = n;
        }
        return k;
    }
}