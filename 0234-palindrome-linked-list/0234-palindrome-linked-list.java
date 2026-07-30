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
    public boolean isPalindrome(ListNode head) {

        ListNode slow=head,fast=head;
        if(head==null||head.next==null){
            return true;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=null;
        while(slow!=null){
            ListNode next=slow.next;
            slow.next=curr;
            curr=slow;
            slow=next;
        }
        while(curr!=null){
            if(curr.val!=head.val){
                return false;
            }
            curr=curr.next;
            head=head.next;
        }
        return true;
    }
}