/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode t1 = headA,t2= headB;
        int i =0,j=0;
        while(i!=2 && j != 2){
            if(t1==t2){
                return t1;
            }
            else{
                t1 = t1.next;
                t2 = t2.next;   
                if(t1==null){
                    t1 = headB;
                    i++;
                }if(t2==null){
                    t2=headA;
                    j++;
                }
            }
        }
        return null;
    }
}