/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        int len1 = 0, len2 = 0;
        ListNode tmpHead1 = headA, tmpHead2 = headB;
        while(tmpHead1 != null) {
            len1++;
            tmpHead1 = tmpHead1.next;
        }
        while(tmpHead2 != null) {
            len2++;
            tmpHead2 = tmpHead2.next;
        }
        
        tmpHead1 = headA;
        tmpHead2 = headB;
        if(len1 > len2) {
            for(int i = 0; i < len1-len2; i++)
                tmpHead1 = tmpHead1.next;
        }
        if(len1 < len2) {
            for(int i = 0; i < len2-len1; i++)
                tmpHead2 = tmpHead2.next;
        }
        
        while(tmpHead1 != null && tmpHead2 != null) {
            if(tmpHead1 == tmpHead2)
                return tmpHead1;
            tmpHead1 = tmpHead1.next;
            tmpHead2 = tmpHead2.next;
        }
        return null;
    }
}