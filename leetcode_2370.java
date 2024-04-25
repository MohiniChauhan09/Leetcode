//Approach-(Optimised - Chec only those characters for s[i] such that abs(ch - s[i]) <=k)
//T.C : O(n)
//S.C : O(1)
class Solution {
    public int longestIdealString(String s, int k) {
        int n=s.length();
        int t[]=new int[26];
        Arrays.fill(t,0);
        int result=0;

        for(int i=0;i<n;i++){
            int curr=s.charAt(i)-'a';
            int left= Math.max(0,curr-k);
            int right= Math.min(curr+k, 25);
            
            int longest=0;
            for(int j=left; j<=right; j++){
                longest=Math.max(longest, t[j]);
            }
            t[curr]= Math.max(t[curr], longest+1);
            result=Math.max(result, t[curr]);
        }
        return result;
        
    }
}
