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

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = reverse(l1);
        ListNode t2 = reverse(l2);
        ListNode tem = new ListNode(-1);
        ListNode temp = tem;
        int carry = 0;

        while(t1 != null || t2 != null){
            int sum =0;
            if(t1 != null){
                sum+= t1.val;
                t1=t1.next;
            }
            if(t2 != null){
                sum+=t2.val ;
                t2 = t2.next;
            }
            sum += carry;
            ListNode ans = new ListNode(sum%10);
            temp.next = ans;
            temp = temp.next;
            carry = sum/10;
        }
        if(carry ==1){
            ListNode ans = new ListNode(1);
            temp.next = ans;
        }
         return reverse(tem.next);
    }
}