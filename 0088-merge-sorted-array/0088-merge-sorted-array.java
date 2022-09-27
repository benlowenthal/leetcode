class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //combine arrays
        for (int x = 0; x < n; x++) nums1[m + x] = nums2[x];
        
        for (int j = m; j < m + n; j++)
            for (int i = 0; i < j; i++)
                if (nums1[i] > nums1[j])
                    swap(nums1, i, j);
    }
    
    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}