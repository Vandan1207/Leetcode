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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode t1 = list1 , t2 = list1;
        int i =0 ,j=0;
        while(i<a-1){
            t1= t1.next;
            i++;
        }
        while(j<b+1){
            t2= t2.next;
            j++;
        }
        t1.next = list2;
        ListNode temp = list2;
        while(temp.next!= null){
            temp = temp.next;
        }
        temp.next = t2;
        return list1;
    }
}