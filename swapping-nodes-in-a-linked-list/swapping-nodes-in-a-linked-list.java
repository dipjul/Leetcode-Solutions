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
    public ListNode swapNodes(ListNode head, int k) {
        int val;
        ListNode node1 = null, node2 = null, temp1 = head, temp2 = head;
        int n = 0;
        int tempK = k;
        while(temp1!=null) {
            if(tempK == 1)
                node1 = temp1;
            n++;
            tempK--;
            temp1 = temp1.next;
        }
        while(n-k>0) {
            temp2 = temp2.next;
            n--;
        }
        node2 = temp2;
        val = node1.val;
        node1.val = node2.val;
        node2.val = val;
        return head;
    }
}