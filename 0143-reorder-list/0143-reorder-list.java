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
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode curr=slow.next;
        slow.next=null;
        ListNode next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=head;
        curr=prev;
        while(curr!=null){
            ListNode temp1=left.next;
            ListNode temp2=curr.next;

            left.next=curr;
            curr.next=temp1;
            left=temp1;
            curr=temp2;
        }
    }
}