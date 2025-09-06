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
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        ListNode t2 = head.next;
        int sum =0;
        while(t2!=null){
            sum+= t2.val;
            if(t2.val==0){
                ListNode newNode = new ListNode(sum);
                sum =0;
                temp.next= newNode;
                temp = newNode;                
            }
            t2 = t2.next;
        }
        return ans.next;
    }
}