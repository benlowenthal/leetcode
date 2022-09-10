class Solution {
    public int maxArea(int[] height) {
        //work two pointers twds the centre
        int max = 0, left = 0, right = height.length - 1;
        
        while (left != right) {
            int area = ((height[left] > height[right]) ? height[right] : height[left]) * (right - left);
            max = (area > max) ? area : max;
            if (height[left] > height[right]) right--;
            else left++;
        }
        
        return max;
    }
}