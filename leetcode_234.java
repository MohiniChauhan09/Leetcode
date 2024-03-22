// T.C : O(n)
// S.C : O(n)
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> temp = new ArrayList<>();

        ListNode curr = head;
        while(curr != null) {
            temp.add(curr.val);
            curr = curr.next;
        }

        int i = 0;
        int j = temp.size() - 1;

        while(i < j) {
            if(!temp.get(i).equals(temp.get(j)))
                return false;

            i++;
            j--;
        }

        return true;
    }
}
