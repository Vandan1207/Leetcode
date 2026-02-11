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

    public ListNode getKthNode(ListNode head, int k){
        int i=1;
        ListNode temp = head;
        while(i<k && temp!=null){
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;

        while(curr!= null){
            next =curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        while(head!=null){
            ListNode kNode=getKthNode(head,k);
            if(kNode != null){
                ListNode next = kNode.next;
                kNode.next = null;
                ListNode newHead = reverse(head);
                temp.next = newHead;
                temp = head;
                head = next;
            }else{
                temp.next = head;
                head = null;
            }
        }


        return dummy.next;
    }
}