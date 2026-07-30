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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { //tc=O(n),sc=O(n)

        ListNode p1=l1,p2=l2;
        ListNode count1=p1,count2=p2;
        int len1=0,len2=0;

        while(count1!=null){
            len1++;
            count1=count1.next;
        }
        while(count2!=null){
            len2++;
            count2=count2.next;
        }

        if(len2>len1){
            ListNode temp=p1;
            l1=l2;
            l2=temp;

            p1 = l1;
            p2 = l2;
        }
        int carry=0;ListNode prev=null;
        while(p1!=null){
            int sum=carry;
            sum+=p1.val;
            if(p2!=null){
                sum+=p2.val;
                p2 = p2.next;
            }
            p1.val=sum%10;
            carry=sum/10;
            prev=p1;
            p1=p1.next;  
        }
        if(carry!=0){
            prev.next=new ListNode(carry);
        }
        return l1;
    }
}