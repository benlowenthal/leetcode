class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        
        List<List<String>> translate = List.of(
            List.of("a", "b", "c"),
            List.of("d", "e", "f"),
            List.of("g", "h", "i"),
            List.of("j", "k", "l"),
            List.of("m", "n", "o"),
            List.of("p", "q", "r", "s"),
            List.of("t", "u", "v"),
            List.of("w", "x", "y", "z")
        );
        
        //populate list
        List<List<String>> values = new ArrayList<>();
        for (int idx = 0; idx < digits.length(); idx++) {
            values.add(translate.get(digits.charAt(idx) - '2'));
        }
        
        //calculate number of perms
        int numSolutions = 1;
        for (List<String> v : values) numSolutions *= v.size();
        
        //find permutations
        List<String> combos = new ArrayList<>();
        for (int i = 0; i < numSolutions; i++) {
            StringBuilder sb = new StringBuilder();
            
            int cycle = 1;
            for (List<String> v : values) {
                int j = i / cycle;
                
                sb.append(v.get(j % v.size()));
                
                cycle *= v.size();
            }
            
            combos.add(sb.toString());
        }
        
        return combos;
    }
}