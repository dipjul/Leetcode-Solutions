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

    public ListNode partion(ListNode[] lists, int s, int e) {
        if (s == e) return lists[s];
        if (s < e) {
            int q = (s + e) / 2;
            ListNode l1 = partion(lists, s, q);
            ListNode l2 = partion(lists, q + 1, e);
            return merge2LL(l1, l2);
        } else return null;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        return partion(lists, 0, lists.length - 1);
    }

    public ListNode merge2LL(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tmp = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
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

        if (l1 == null) tmp.next = l2;
        if (l2 == null) tmp.next = l1;
        return dummyHead.next;
    }
}
