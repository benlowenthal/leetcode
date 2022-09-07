class Solution {
    public int[] twoSum(int[] nums, int target) {
        //map of values to indices
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for (int x = 0; x < nums.length; x++){
            int num = nums[x];
            int y = target - num;
            
            //if mapping exists then answer found
            if (map.keySet().contains(y)){
                return new int[] {x, map.get(y)};
            }
            
            map.put(num, x);
        }
        
        return null;
    }
}