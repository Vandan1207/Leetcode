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
    public int[] nextLargerNodes(ListNode head) {
        int len =0;
        ListNode temp = head;
        while(temp!=null){
            temp =temp.next;
            len++;
        }
        int ans [] = new int[len];
        int i =0;
        temp = head;
        while(temp!=null){
            ans[i]=0;
            ListNode iterator = temp.next;
            while(iterator != null){
                if(iterator.val > temp.val){
                    ans[i] = iterator.val;
                    break;
                }
                iterator=iterator.next;
            }
            i++;  
            temp = temp.next;
        }
        return ans;

    }
}