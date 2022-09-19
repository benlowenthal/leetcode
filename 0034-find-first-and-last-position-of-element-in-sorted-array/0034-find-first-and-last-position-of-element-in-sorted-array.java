class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i = -1;
        int j = -1;
        
        int left = 0;
        int right = nums.length - 1;
        
        //binary search for leftmost value
        while (right >= left) {
            int mid = (left + right) / 2;
            
            if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
            else {
                if (i == -1 || mid < i) i = mid;
                right = mid - 1;
            }
        }
        
        left = 0;
        right = nums.length - 1;
        
        //binary search for rightmost value
        while (right >= left) {
            int mid = (left + right) / 2;
            
            if (nums[mid] > target) right = mid - 1;
            else if (nums[mid] < target) left = mid + 1;
            else {
                if (mid > j) j = mid;
                left = mid + 1;
            }
        }
        
        return new int[] { i, j };
    }
}