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
    public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null)
        return;
       ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode cur=slow.next;
        slow.next=null;
        ListNode fi=head;
         ListNode prev=null;
       
        
        while(cur!=null){
            ListNode nex=cur.next;
        cur.next=prev;
        prev=cur;
        cur=nex;
        
        }
       ListNode se=prev;

        while(se!=null){
             ListNode temp1=fi.next;
              ListNode temp2=se.next;
fi.next=se;
se.next=temp1;
fi=temp1;
se=temp2;

        }

    }
   
}