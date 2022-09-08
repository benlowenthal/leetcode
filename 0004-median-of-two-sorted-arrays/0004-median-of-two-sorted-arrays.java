class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // merge sort
        List<Integer> combined = new ArrayList<Integer>();
        int ptr = 0;
        for (int x : nums1){
            while (ptr < nums2.length && nums2[ptr] < x){
                combined.add(nums2[ptr]);
                ptr++;
            }
            combined.add(x);
        }
        
        for (int idx = ptr; idx < nums2.length; idx++){
            combined.add(nums2[idx]);
        }
        
        System.out.println(combined);
        
        if (combined.size() % 2 == 1){
            return combined.get(combined.size() / 2);
        }
        return (combined.get(combined.size() / 2) + combined.get(combined.size() / 2 - 1)) / 2f;
    }
}