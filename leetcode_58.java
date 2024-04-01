// T.C: O(n)
// S.C: O(1)

class Solution {
    public int lengthOfLastWord(String s) {

        String s2 = s.stripTrailing();
        int n=s2.length();

        int lastWordLength=0;
        for(int i= n-1; i>=0; i--){
            if(s2.charAt(i) == ' '){
                break;
            }else{
                lastWordLength++;
            }
        }
        return lastWordLength;
        
    }
}
