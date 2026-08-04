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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode dummy=head;
        ListNode left=head;
        ListNode tail=null;
        int count=0;
        while(head!=null){
            tail=head;
            head=head.next;
            count++;
        }
        k=k%count;
        if(k==0){
            return left;
        }
        
        for(int i=1;i<count-k;i++){
            dummy=dummy.next;
        }
        ListNode newHead = dummy.next;
        dummy.next=null;

        tail.next=left;

        return newHead;
    }
}