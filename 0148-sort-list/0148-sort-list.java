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
   public ListNode getMid(ListNode head){
        ListNode slow = head, fast = head.next;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode head1, ListNode head2){

        ListNode ans = new ListNode (Integer.MIN_VALUE);
        ListNode temp = ans;

        while(head1 !=null && head2 != null){
            if(head1.val< head2.val){
                temp.next = head1;
                head1= head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1!= null){
                temp.next = head1;
                head1= head1.next;
                temp = temp.next;
        }
        while(head2 != null){
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }
        return ans.next;
    }

    
    public ListNode sortList(ListNode head) {
        if(head ==null || head.next ==null ){
            return head;
        }
    
        ListNode mid = getMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;
        ListNode leftHalf =  sortList(head);
        ListNode rightHalf = sortList(rightHead);
        return merge(leftHalf,rightHalf);
    }
}