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

    public ListNode getKthNode(ListNode head , int k){
        int i =1;
        ListNode temp = head;
        while(temp!= null && i<k){
            temp = temp.next;
            i++;
        }
        return temp;
    }

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

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode ans = new  ListNode(-1);
        ListNode temp = ans;

        while(head!= null){
            ListNode originalHead = head;
            ListNode kthNode = getKthNode(head,k);
            if(kthNode != null){
            ListNode next = kthNode.next;
            kthNode.next = null;
            ListNode reverseHead = reverse(head);
            temp.next = reverseHead;
            temp = originalHead;
            head = next;
            }else{
                temp.next = head;
                head= null;
            }

        }

        return ans.next;

    }
}