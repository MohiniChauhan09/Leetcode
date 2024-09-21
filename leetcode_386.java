// T.C: O(n)
// S.C: O(number of digits in n) i.e log10(n)
class Solution {
    public void solve(int currNum, int n, List<Integer> ans){
        if(currNum > n) return;
        ans.add(currNum);

        for(int i=0; i<=9; i++){
            int newNum= (currNum * 10) + i;
            if(newNum > n) return;
            solve(newNum, n, ans);
        }
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans= new ArrayList<>();
        for(int currNum=1; currNum<=9; currNum++){
            solve(currNum, n, ans);
        }
        return ans;
    }
   
}
