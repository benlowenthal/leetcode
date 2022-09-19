class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        
        List<List<Integer>> combs = new ArrayList<>();
        
        backtrack(combs, new ArrayList<>(), candidates, target, 0);
        
        return combs;
    }
    
    private void backtrack(List<List<Integer>> out, List<Integer> temp, int[] nums, int tgt, int start){
        //not a valid combination so go back a level
        if (tgt < 0) return;
        
        //valid combination so add to output list
        if (tgt == 0) out.add(new ArrayList<>(temp));
        
        //add value into temp list + backtrack with lowered target
        else for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(out, temp, nums, tgt - nums[i], i);
            temp.remove(temp.size() - 1);
        }
    }
}