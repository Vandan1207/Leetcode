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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp =head, prev = head;
        int len=0;
        while(temp!=null){
            prev = temp;
            temp=temp.next;
            len++;
        }
        if(len==0 || k==0){
            return head;
        }
        int i = k%len;
        if(i==0){
            return head;
        }
        prev.next = head;
        temp = head;
        while(len-i-1!=0){
            temp =temp.next;
            i++;
        }
        head = temp.next;
        temp.next = null;
       return head;
    }
}