/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean ifExist(ListNode head){
         ListNode slow = head, fast = head;
         while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow ==fast){
                return true;
            }
        }
        return false;
    }
    public ListNode cycleNode(ListNode head){
        ListNode slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow ==fast){
                break;
            }
        }
        fast = head;
        while(fast!=slow){
            fast= fast.next;
            slow = slow.next;
        }
        return fast;
    }
    public ListNode detectCycle(ListNode head) {
       
        return ifExist(head)? cycleNode(head): null;
   }
}