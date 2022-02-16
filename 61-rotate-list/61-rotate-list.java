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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0)
            return head;
        ListNode tmpHead = head, tmp = head;
        int len = 0;
        while(tmp != null) {
            len++;
            tmp = tmp.next;
        }
        k = k % len;
        if(k == 0)
            return head;
        ListNode ptr = head;
        for(int i = 0; i < len - k-1; i++) {
            ptr = ptr.next;
        }
        ListNode remainingList = ptr.next;
        ptr.next = null;
        ListNode result = remainingList;
        while(remainingList.next != null) {
            remainingList = remainingList.next;
        }
        remainingList.next = head;
        return result;
    }
}