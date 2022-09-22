class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        
        Arrays.sort(intervals, (x,y) -> x[0] - y[0]);
        
        int low = -1;
        int high = -1;
        
        for (int[] pair : intervals) {
            if (pair[0] > high) {
                if (low >= 0 && high >= 0)
                    list.add(new int[] {low, high});
                low = pair[0];
            }
            
            high = Math.max(high, pair[1]);
        }
        list.add(new int[] {low, high});
        
        int[][] out = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) out[i] = list.get(i);
        return out;
    }
}