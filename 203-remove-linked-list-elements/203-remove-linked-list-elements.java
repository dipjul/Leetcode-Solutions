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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode tmpHead = new ListNode(-1);
        tmpHead.next = head;
        ListNode prev = null, curr = tmpHead;
        while(curr != null) {
            if(curr.val == val) {
                ListNode next = curr.next;
                prev.next = curr.next;
                curr = next;
            } else {
            prev = curr;
            curr = curr.next;
            }
        }
        return tmpHead.next;
    }
}