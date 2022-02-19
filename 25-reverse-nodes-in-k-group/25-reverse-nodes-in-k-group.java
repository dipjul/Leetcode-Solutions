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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode root = new ListNode(0, head); // dummy head
        ListNode curr = head, prev = root;
        
        while(curr != null) {
            ListNode tail = curr; // keep track of the 1st element of each group
            int listIndex = 0;
            
            while(curr != null && listIndex < k) {
                curr = curr.next;
                listIndex++;
            }
            // listIndex != k means we have a group less than k size
            if(listIndex != k)
                prev.next = tail;
                // less than k size so simply pointing prev to the 
                // first element of the group
            else {
                // reverse the group
                prev.next = reverse(tail, k);
                // prev will move to the first element(now the last) of the group
                // so that next of it would have the reverse of the group
                prev = tail;
            }
        }
        return root.next;
    }
    
    private ListNode reverse(ListNode head, int k) {
        ListNode curr = head, prev = null, next = null;
        
        while(curr != null && k > 0) {
            k--;
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }
}