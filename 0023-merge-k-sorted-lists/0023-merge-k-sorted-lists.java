/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        lists = Arrays.stream(lists).filter(n -> n != null).toArray(ListNode[]::new);
       
        //base case
        if (lists.length == 0) return null;
        
        int val = Integer.MAX_VALUE;
        int ptr = 0;
        
        for (int idx = 0; idx < lists.length; idx++) {
            if (lists[idx].val < val) {
                val = lists[idx].val;
                ptr = idx;
            }
        }
        
        lists[ptr] = lists[ptr].next;
        return new ListNode(val, mergeKLists(lists));
    }
}