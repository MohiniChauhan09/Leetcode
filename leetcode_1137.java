// Approach- (Using Bottom Up DP)
// T.C: O(n)
// S.C: O(n) (But size of t is 38 which is constant hence O(1))
class Solution {
    public int tribonacci(int n) {
        int[] t = new int[38];

        t[0] = 0;
        t[1] = 1;
        t[2] = 1;
        
        for (int i = 3; i <= 37; i++) {
            t[i] = t[i-1] + t[i - 2] + t[i - 3];
        }
        
        return t[n];
    }
}
