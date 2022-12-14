class Solution {
    public void sortColors(int[] nums) {
        int r = 0, w = 0;
        
        //count amount of red and white
        for (int n : nums) {
            if (n == 0) r++;
            else if (n == 1) w++;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i < r) nums[i] = 0;
            else if (i < r + w) nums[i] = 1;
            else nums[i] = 2;
        }
    }
}