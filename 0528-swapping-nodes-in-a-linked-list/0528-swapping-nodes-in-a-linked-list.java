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
    public ListNode swapNodes(ListNode head, int k) {
        //Because the list is 1 indexed, we will take i and j as 1
        int i =1;
        ListNode t1 = head,t2= head;
        while(i<k){
            t2= t2.next;
            i++;
        }
        while(t2.next!=null){
            t2=t2.next;
            t1= t1.next;
        }
        int j = 1;
        t2= head;
        while(j<k){
            t2 = t2.next;
            j++;
        }
        int temp = t1.val;
        t1.val = t2.val;
        t2.val =  temp;

        return head;
    }
}