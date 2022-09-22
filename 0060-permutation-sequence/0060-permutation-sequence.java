class Solution {
    public String getPermutation(int n, int k) {
        List<String> str = new ArrayList<>();
        
        for (int x = 1; x <= n; x++) str.add(String.valueOf(x));
        
        int sols = 1;
        for (int i = 1; i <= n; i++) sols *= i;
        
        return perm(str, k - 1, sols);
    }
    
    private String perm(List<String> s, int k, int solutions) {
        if (s.size() == 1) return s.get(0);
        
        int idx = k / (solutions / s.size());
        String letter = s.get(idx);
        
        s.remove(idx);
        
        solutions = 1;
        for (int i = 1; i <= s.size(); i++) solutions *= i;
        return letter + perm(s, k % solutions, solutions);
    }
}