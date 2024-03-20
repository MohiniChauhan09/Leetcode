// T.C: O(n)
// S.C: O(1)
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode right=list1;
        ListNode left=null;
        for(int i=0; i<=b; i++){
            if( i==(a-1) ){
                left=right;
            }
            right=right.next;
        }
        left.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=right;
        return list1;
        
    }
}
