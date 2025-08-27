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
    public void reorderList(ListNode head) {
        ListNode slow = head,fast = head.next;
        while(fast!=null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = slow;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        fast = head; slow = prev;
        while(fast!= null && slow != null){
            ListNode temp1 = fast.next;
            fast.next = slow;
            ListNode temp2 = slow.next;
            slow.next = temp1;
            fast = temp1;
            slow = temp2;
        }
    }
}