class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        //binary search for rotation point
        while (right > left) {
            int mid = (left + right) / 2;
            
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        
        right = left + nums.length - 1;
        
        //binary search for target
        while (right >= left) {
            int mid = (left + right) / 2;
            mid = (mid < nums.length) ? mid : mid - nums.length;
            
            if (nums[mid] > target) right--;
            else if (nums[mid] < target) left++;
            else return mid;
        }
        
        //if search complete but target not found
        return -1;
    }
}