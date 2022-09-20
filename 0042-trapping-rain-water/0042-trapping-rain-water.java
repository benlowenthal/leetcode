class Solution {
    public int trap(int[] height) {
        //no solutions
        if (height == null || height.length == 0) return 0;
        
        int total = 0;
        
        int left = 0;
        int right = height.length - 1;
        
        int maxLeft = 0;
        int maxRight = 0;
        
        while (left <= right) {
            if (height[left] > maxLeft) maxLeft = height[left];
            if (height[right] > maxRight) maxRight = height[right];
            
            //max water height is the smaller of the two heights
            if (maxLeft < maxRight) {
                total += maxLeft - height[left];
                left++;
            } else {
                total += maxRight - height[right];
                right--;
            }
        }
        
        return Math.max(total, 0);
    }
}