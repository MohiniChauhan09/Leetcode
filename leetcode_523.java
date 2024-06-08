// T.C: O(n)
// S.C: O(n)
class Solution {
  public boolean checkSubarraySum(int[] nums, int k) {
    int prefix = 0;
    Map<Integer, Integer> mp = new HashMap<>();
    mp.put(0, -1);

    for (int i = 0; i < nums.length; ++i) {
      prefix += nums[i];
      if (k != 0)
        prefix %= k;
      if (mp.containsKey(prefix)) {
        if (i - mp.get(prefix) >= 2)
          return true;
      } else {
        // Set a new key if it's absent because the previous index is better.
        mp.put(prefix, i);
      }
    }

    return false;
  }
}
