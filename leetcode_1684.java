// T.C: O(n) + O(m * maxLength(words[i]))    m=length of words
// S.C: O(n)    n=length of 'allowed' string
class Solution {
    public boolean isConsistent(String str, Set<Character> set){
        boolean consistent=false;
        for(int i=0; i<str.length(); i++){
            if( set.contains(str.charAt(i)) ) continue;
            else return false;
        }
        consistent=true;
        return consistent;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set= new HashSet<>();
        for(char ch: allowed.toCharArray()){
            set.add(ch);
        }
        int count=0;
        for(int i=0; i<words.length; i++){
            if(isConsistent(words[i], set)){
                count++;
            }
        }
        return count;
    }
}
