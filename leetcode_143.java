// T.C: O(n)
// S.C: O(1)
class Solution {
    public ListNode reverse(ListNode mid){
        ListNode prev=null;
        ListNode curr=mid;
        ListNode next=mid;
        
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;   //mid-slow
        }

        // if(fast!=null){ //odd
        //     slow=slow.next;
        // }

        ListNode revHead=reverse(slow);
        ListNode curr=head;
        while(revHead.next != null){
            ListNode tempCurr=curr.next;
            curr.next=revHead;

            ListNode tempRev=revHead.next;
            revHead.next=tempCurr;

            curr=tempCurr;
            revHead=tempRev; 
        }
    }
}
