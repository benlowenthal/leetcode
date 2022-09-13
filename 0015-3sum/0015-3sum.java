class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //set avoids duplicates
        Set<List<Integer>> arrays = new HashSet<>();
        
        Arrays.sort(nums);
        
        //compile list of tuples
        for (int i = 0; nums[i] <= 0 && i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) right--;
                else if (sum < 0) left++;
                else {
                    arrays.add(List.of(nums[i], nums[left], nums[right]));
                    right--;
                    left++;
                }
            }
        }
        
        return new ArrayList<List<Integer>>(arrays);
    }
}