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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode tmpHead = new ListNode(0);
        tmpHead.next = head;
        ListNode fast = tmpHead, slow = tmpHead;
        for(int i=0; i <= n; i++)
            fast = fast.next;
        
        
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        
        return tmpHead.next;
    }
}