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
    private ListNode rev(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newhead=rev(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head==null||head.next==null){
            return head;
        }

        int count=0;
        ListNode temp=head;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        if(count<k){
            return head;
        }
        ListNode nextGroup=temp;
        ListNode curr=head;
        for(int i=0;i<k-1;i++){
            curr=curr.next;
        }
        curr.next=null;

        ListNode newhead=rev(head);
        head.next=reverseKGroup(nextGroup,k);

        return newhead;
        
    }
}