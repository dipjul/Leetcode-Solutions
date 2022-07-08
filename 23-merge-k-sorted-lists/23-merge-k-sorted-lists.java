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
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        if(k == 0)
            return null;
        int i = 0;
        while(i+1<k) {
            ListNode l1 = lists[i], l2 = lists[i+1];
            lists[i+1] = merge2LL(l1, l2);
            i++;
        }
        return lists[k-1];
    }
    
    public ListNode merge2LL(ListNode l1, ListNode l2) {
       ListNode dummyHead = new ListNode(0);
       ListNode tmp = dummyHead;
       while(l1 != null && l2 != null) {
           if(l1.val < l2.val) {
                tmp.next = l1;
                ListNode nextL1 = l1.next;
                l1.next = l2;
                l1 = nextL1;
                tmp = tmp.next;
           } else {
                tmp.next = l2;
                ListNode nextL2 = l2.next;
                l2.next = l1;
                l2 = nextL2;
                tmp = tmp.next;
           }
       }

       if(l1 == null)
           tmp.next = l2;
       if(l2 == null)
           tmp.next = l1;
       return dummyHead.next;
   }
}