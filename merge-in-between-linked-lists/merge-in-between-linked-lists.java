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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode a1 = null, b1 = null, temp = list1, temp2 = list2;
        while(temp.next != null) {
            if(a == 1) {
                a1 = temp;
            }
            if(b == 0) {
                b1 = temp.next;
            }
            a--;b--;
            temp = temp.next;
        }
        while(temp2.next != null) {
            temp2 = temp2.next;
        }
        a1.next = list2;
        temp2.next = b1;
        
        return list1;
    }
    
}