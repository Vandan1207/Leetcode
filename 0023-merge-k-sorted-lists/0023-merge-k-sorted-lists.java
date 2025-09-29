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
 
    public ListNode mergeTwoList(ListNode h1, ListNode h2){
        ListNode ans = new ListNode(-1);
        ListNode temp= ans;

        while(h1!= null && h2 != null){
            if(h1.val<h2.val){
                temp.next = h1;
                h1= h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2 = h2.next;
                temp= temp.next;
            }
        }
        while(h1!=null){
              temp.next = h1;
                h1= h1.next;
                temp = temp.next;
        }
        while(h2!=null){
             temp.next = h2;
                h2 = h2.next;
                temp= temp.next;
        }
    
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        ListNode head = lists[0];
        for(int i =1;i<lists.length;i++){
            head = mergeTwoList(head,lists[i]);
        }
        return head;
    }
}