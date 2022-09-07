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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode nextL1 = l1;
        ListNode nextL2 = l2;
        
        ListNode first = null;
        ListNode node = null;
        
        int carry = 0;
        
        while (nextL1 != null || nextL2 != null || carry != 0){
            int total = ((nextL1 == null) ? 0 : nextL1.val) + ((nextL2 == null) ? 0 : nextL2.val) + carry;
            
            int sum = total % 10;
            carry = total / 10;
            
            ListNode newNode = new ListNode(sum);
            
            if (node == null) {
                first = newNode;
            } else {
                node.next = newNode;
            }
            node = newNode;
            
            nextL1 = (nextL1 == null) ? null : nextL1.next;
            nextL2 = (nextL2 == null) ? null : nextL2.next;
        }
        
        return first;
    }
}
