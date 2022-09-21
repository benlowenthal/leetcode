class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);
        
        if (nums.length < 2) return List.of(list);
        
        return new ArrayList<>(partialPermute(list));
    }
    
    private Set<List<Integer>> partialPermute(List<Integer> nums) {
        if (nums.size() == 2) {
            int x = nums.get(0);
            int y = nums.get(1);
            
            List<Integer> xl = new ArrayList<>();
            xl.add(x); xl.add(y);
            
            List<Integer> yl = new ArrayList<>();
            yl.add(y); yl.add(x);
            
            Set<List<Integer>> list = new HashSet<>();
            list.add(xl); list.add(yl);
            return list;
        }
        
        Set<List<Integer>> perms = new HashSet<>();
        
        for (int i = 0; i < nums.size(); i++) {
            Integer temp = nums.get(i);
            nums.remove(i);
            Set<List<Integer>> pp = partialPermute(nums);
            for (List<Integer> p : pp) {
                p.add(temp);
                perms.add(p);
            }
            nums.add(i, temp);
        }
        
        return perms;
    }
}