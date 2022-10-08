class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        List<Integer> list = triangle.get(triangle.size() - 1);
        
        //iterate up the triangle adding the min value from below
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            
            for (int j = 0; j < row.size(); j++) {
                list.set(j, row.get(j) + Math.min(list.get(j), list.get(j+1)));
            }
        }
        
        return list.get(0);
    }
}