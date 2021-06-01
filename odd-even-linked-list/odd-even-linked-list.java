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
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null;
        ListNode odd = head, evenFinal = head.next,  even = evenFinal;

        while(even != null && even.next != null) {
            // for odd nodes
            // that node should point to (next of next node)
            odd.next = odd.next.next;
            //update the odd pointer to point to the new next node
            odd = odd.next; // otherwise odd list will be stuck here
            
            //same as odd nodes
            even.next = even.next.next;
            even = even.next;
        }
        //joining the even list to the end of the odd list
        odd.next = evenFinal;
        return head;
    }
}