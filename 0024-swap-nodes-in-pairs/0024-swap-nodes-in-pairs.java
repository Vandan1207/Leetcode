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

    public void reverse(ListNode head){
        ListNode curr = head;
        ListNode next;
        ListNode prev=null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;

        while(head!=null){
            ListNode adj = head.next;
            if(adj!=null){
                ListNode next = adj.next;
                adj.next = null;
                reverse(head);
                temp.next = adj;
                temp= head;
                head = next;
            }else{
                temp.next = head;
                head= null;
            }
        }

        return ans.next;
    }
}