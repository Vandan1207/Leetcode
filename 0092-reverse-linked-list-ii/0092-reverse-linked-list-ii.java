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
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode getNode(ListNode head, int k){
        ListNode temp = head;
        int i=1;
        while(i<k){
            i++;
            temp= temp.next;
        }
        return temp;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left== right){
            return head;
        }
        ListNode rightHead= getNode(head,right);
        ListNode nextRight = rightHead.next;
        ListNode leftHead = getNode(head,left);
        rightHead.next = null;
        ListNode reverseHead = reverse(leftHead);
        leftHead.next = nextRight;
        if(left==1){
            head = reverseHead;
            return head;
        }
        ListNode prevLeftHead = getNode(head,left-1);
        prevLeftHead.next = reverseHead;
        return head;
    }
}