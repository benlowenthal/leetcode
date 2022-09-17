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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        List<ListNode> nodes = new ArrayList<ListNode>();
        for (ListNode n = head; n != null; n = n.next) nodes.add(n);
        
        for (int i = 0; i < nodes.size(); i++) {
            if (i % 2 == 1) nodes.get(i).next = nodes.get(i - 1);
            else if (i + 3 < nodes.size()) nodes.get(i).next = nodes.get(i + 3);
            else if (nodes.size() % 2 == 1 && i < nodes.size() - 1) nodes.get(i).next = nodes.get(nodes.size() - 1);
            else nodes.get(i).next = null;
        }
        
        return nodes.get(1);
    }
}