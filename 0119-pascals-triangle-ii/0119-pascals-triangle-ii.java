class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        
        for (int i = 0; i <= rowIndex; i++) {
            prev = generateRow(prev);
        }
        
        return prev;
    }
    
    private List<Integer> generateRow(List<Integer> previous) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        
        if (previous.isEmpty()) return row;
        
        for (int i = 0; i < previous.size() - 1; i++) {
            row.add(previous.get(i) + previous.get(i+1));
        }
        
        row.add(1);
        return row;
    }
}