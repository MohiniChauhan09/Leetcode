//T.C : O(n)
//S.C : O(1)
class Solution {
    public int minOperations(int[] nums, int k) {
        int totalXor = 0;
        for (int num : nums) {
            totalXor ^= num;
        }
        
        int diff = (totalXor ^ k);
        return Integer.bitCount(diff);
    }
}
