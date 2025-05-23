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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode dum=new ListNode(0);
        ListNode res=dum;
        int carry=0;
        while(l1!=null||l2!=null||carry!=0){
int sum=0;
if(l1!=null){
    sum+=l1.val;
    l1=l1.next;
}
if(l2!=null){
    sum+=l2.val;
    l2=l2.next;
}
sum+=carry;
carry=sum/10;
res.next=new ListNode(sum%10);

res=res.next;
        }
        res=reverse(dum.next);
        return res;
    }
    ListNode reverse(ListNode temp){
        ListNode cur=temp;
        ListNode prev=null;
        while(cur!=null){
            ListNode nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;
        }
        return prev;
    }
}