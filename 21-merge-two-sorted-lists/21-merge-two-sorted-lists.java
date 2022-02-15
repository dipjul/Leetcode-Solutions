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
        ListNode tmpHead = new ListNode(0);
        ListNode result = tmpHead;
        while(ptr1 != null && ptr2 != null) {
            if(ptr1.val <= ptr2.val) {
                tmpHead.next = new ListNode(ptr1.val);
                ptr1 = ptr1.next;
            } else {
                tmpHead.next = new ListNode(ptr2.val);
                ptr2 = ptr2.next;
            }
            tmpHead = tmpHead.next;
        }
        
        while(ptr1 != null) {
            tmpHead.next = new ListNode(ptr1.val);
            tmpHead = tmpHead.next;
            ptr1 = ptr1.next;
        }
        
        while(ptr2 != null) {
            tmpHead.next = new ListNode(ptr2.val);
            tmpHead = tmpHead.next;
            ptr2 = ptr2.next;
        }
        return result.next;
    }
}