
//T.C : O(n)
//S.C : O(1)
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return 0;
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        int currSum = 0;
        int maxL = 0;
        
        mp.put(0, -1);
        
        for (int i = 0; i < n; i++) {
            currSum += (nums[i] == 1) ? 1 : -1;
            if (mp.containsKey(currSum)) {
                maxL = Math.max(maxL, i - mp.get(currSum));
            } else
                mp.put(currSum, i);
        }
        return maxL;
    }
}
