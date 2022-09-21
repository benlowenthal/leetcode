class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);
        
        if (nums.length < 2) return List.of(list);
        
        return partialPermute(list);
    }
    
    private List<List<Integer>> partialPermute(List<Integer> nums) {
        if (nums.size() == 2) {
            int x = nums.get(0);
            int y = nums.get(1);
            
            List<Integer> xl = new ArrayList<>();
            xl.add(x); xl.add(y);
            
            List<Integer> yl = new ArrayList<>();
            yl.add(y); yl.add(x);
            
            List<List<Integer>> list = new ArrayList<>();
            list.add(xl); list.add(yl);
            return list;
        }
        
        List<List<Integer>> perms = new ArrayList<>();
        
        for (int i = 0; i < nums.size(); i++) {
            Integer temp = nums.get(i);
            nums.remove(i);
            List<List<Integer>> pp = partialPermute(nums);
            for (int j = 0; j < pp.size(); j++) {
                pp.get(j).add(temp);
                perms.add(pp.get(j));
            }
            nums.add(i, temp);
        }
        
        return perms;
    }
}