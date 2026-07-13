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
    public ListNode removeNthFromEnd(ListNode head, int n) {


       ListNode curr=head;
        ListNode prev=head;
       int len=0;
       while(curr!=null){
          len++;
          curr=curr.next;
       } 
       if(len==n){
    return head.next;
}
   int first=len-n;
   int c=0;
    curr=head;
   while(curr!=null){
         c++;
         ListNode temp=curr.next;
         
         if(c==first){
             curr.next=temp.next;
            
         }
         curr=curr.next;
         

   }
   return prev;
    }
}
