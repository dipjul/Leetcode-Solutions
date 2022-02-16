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
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return false;
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast != null)
            slow = slow.next;
        slow = reverse(slow);
        
        ListNode tmp = head;
        while(slow != null) {
            if(slow.val != tmp.val)
                return false;
            slow = slow.next;
            tmp = tmp.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null, next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}