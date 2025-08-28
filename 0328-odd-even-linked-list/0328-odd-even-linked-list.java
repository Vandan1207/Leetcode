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
    public ListNode oddEvenList(ListNode head) {        if(head == null){
        return head;
    }
        ListNode odd= head, even = head.next,ref = head.next;
        while(even !=null && odd != null && even.next != null && odd.next != null){
            odd.next = even.next;
            odd = odd.next;
            if(odd== null){
                break;
            }
            even.next = odd.next;
            even = even.next;
        }
        odd.next = ref;
        return head;
    }
}