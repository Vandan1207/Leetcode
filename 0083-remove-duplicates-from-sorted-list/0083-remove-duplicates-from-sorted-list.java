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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null ){
            return head;
        }
        ListNode t1 =head, t2 = head.next;
        while(t1!=null && t2!=null){
            if(t1.val!=t2.val){
                t1.next = t2;
                t1 = t2;
            }else{
                t2=t2.next;
            } 
        }

        t1.next = t2;
        return head;
    }
}