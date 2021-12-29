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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ptr1 = list1, ptr2 = list2;
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        while(ptr1 != null && ptr2 != null) {
            // ListNode tmp = null;
            if(ptr1.val < ptr2.val) {
                result.next = new ListNode(ptr1.val);
                result = result.next;
                ptr1 = ptr1.next;
            } else {
                result.next = new ListNode(ptr2.val);
                result = result.next;
                ptr2 = ptr2.next;
            }
        }
        
        while(ptr1 != null) {
            result.next = new ListNode(ptr1.val);
            result = result.next;
            ptr1 = ptr1.next;
        }
        
        while(ptr2 != null) {
            result.next = new ListNode(ptr2.val);
            result = result.next;
            ptr2 = ptr2.next;
        }
        return tmp.next;
    }
}