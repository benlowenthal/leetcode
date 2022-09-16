class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        //set avoids duplicates
        Set<List<Integer>> arrays = new HashSet<>();
        
        Arrays.sort(nums);
        
        //compile list of quadruplets
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[left] + (long)nums[right];
                    if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) break;
                    
                    if (sum > target) right--;
                    else if (sum < target) left++;
                    else {
                        arrays.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                        right--;
                        left++;
                    }
                }
            }
        }
        
        return new ArrayList<List<Integer>>(arrays);
    }
}