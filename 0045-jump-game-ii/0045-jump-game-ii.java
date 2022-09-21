class Solution {
//     public int jump(int[] nums) {
//         Queue<Integer> queue = new LinkedList<>();
//         queue.add(0);
        
//         int jumps = 0;
//         int levelSize = 1;
//         while (!queue.isEmpty()) {
//             int pos = queue.remove();
            
//             if (pos >= nums.length - 1) return jumps;
            
//             else {
//                 for (int i = nums[pos]; i > 0; i--)
//                     queue.add(pos + i);
                
//                 levelSize--;
//                 if (levelSize == 0) {
//                     levelSize = queue.size();
//                     jumps++;
//                 }
//             }
//         }
        
//         return -1;
//     }
    
    public int jump(int[] nums) {
        int jumps = 0;
        
        int pos = 0;
        while (pos < nums.length - 1) {
            int max = 1;
            
            for (int i = 1; i <= nums[pos] && pos + i < nums.length; i++) {
                if (pos + i == nums.length-1) {
                    max = i;
                    break;
                }
                if (i + nums[pos + i] > max + nums[pos + max])
                    max = i;
            }
                
            
            pos += max;
            jumps++;
        }
        
        return jumps;
    }
}