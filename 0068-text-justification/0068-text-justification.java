class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        if (words.length == 0) return new ArrayList<>();
        
        List<List<String>> s = new ArrayList<>();
        
        int chars = words[0].length();
        List<String> list = new ArrayList<>();
        list.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String w = words[i];
            if (chars + w.length() + 1 <= maxWidth) {
                chars += w.length() + 1;
                list.add(w);
            } else {
                s.add(list);
                list = new ArrayList<>();
                list.add(w);
                chars = w.length();
            }
        }
        if (list.size() > 0) s.add(list);
        
        List<String> out = new ArrayList<>();
        
        for (int i = 0; i < s.size(); i++) {
            int spaces = maxWidth;
            for (String str : s.get(i)) spaces -= str.length();
            
            if (s.get(i).size() == 1)
                out.add(s.get(i).get(0) + " ".repeat(spaces));
            
            else if (i == s.size() - 1)
                out.add(String.join(" ", s.get(i)) + " ".repeat(spaces - s.get(i).size() + 1));
            
            else {
                String x = s.get(i).get(0);
                int gaps = s.get(i).size() - 1;
                for (int j = 1; j < s.get(i).size(); j++)
                    x += " ".repeat(spaces / gaps + ( (spaces % gaps >= j) ? 1 : 0) ) + s.get(i).get(j);
                
                out.add(x);
            }
        }
        
        return out;
    }
}