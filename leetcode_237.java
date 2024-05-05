//T.C : O(n)
//S.C : O(1)
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = null;

        while (node != null && node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        
        if (node != null) {
            if (prev != null)
                prev.next = null;
            else
                node = null;
        }
    }
}
