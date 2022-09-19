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
        
        int k = left;
        
        left = 0;
        right = nums.length - 1;
        
        //binary search for target
        while (right >= left) {
            int mid = (left + right) / 2;
            int midRot = (k + mid < nums.length) ? k + mid : k + mid - nums.length;
            
            if (nums[midRot] > target) right = mid - 1;
            else if (nums[midRot] < target) left = mid + 1;
            else return midRot;
        }
        
        //if search complete but target not found
        return -1;
    }
}