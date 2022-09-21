class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String str = new String(chars);
            
            if (!map.keySet().contains(str)) {
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}