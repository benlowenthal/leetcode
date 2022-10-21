class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int n : nums) {
            //check if n was already in map without iteration
            Integer old = map.put(n, 1);
            if (old != null) {
                if (old+1 > nums.length / 2)
                    return n;
                map.put(n, old+1);
            }
        }
        
        return map.get(nums[0]);
    }
}