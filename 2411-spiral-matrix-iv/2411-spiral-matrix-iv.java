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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int startRow = 0, startCol =0;
        int endRow = m-1, endCol = n-1;
        int ans[][] = new int [m][n];
        while(startRow<=endRow && startCol<=endCol){
            for(int j =startCol; j<=endCol;j++){
                if(head==null){
                ans[startRow][j]= -1;
                }else{
                ans[startRow][j]= head.val;
                head=head.next;
                }
            }
            startRow++;
            for(int i =startRow; i<= endRow;i++){
                if(head == null){
                ans[i][endCol]= -1;                  
                }else{
                ans[i][endCol]= head.val;
                head = head.next;
                }
            }
            endCol--;
            if(startRow<=endRow){
                for(int j =endCol;j>=startCol;j--){
                    if(head == null ){
                    ans[endRow][j]= -1;
                    }else{
                    ans[endRow][j]= head.val;
                    head = head.next;
                    }
                }
            }
            endRow--;
            if(startCol<=endCol){
                for(int i = endRow;i>=startRow;i--){
                    if(head == null){
                    ans[i][startCol]= -1;
                    }else{
                    ans[i][startCol]= head.val;
                    head = head.next;
                    }
                }
            }
            startCol++;
        }

        return ans;
    }
}