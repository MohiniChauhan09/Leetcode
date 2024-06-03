class Solution {
    public int appendCharacters(String s, String t) {
        int m= s.length();
        int n= t.length();

        int i=0;   //pointing to string s
        int j= 0;  //pointing to string t

        while(i<m && j<n){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return n-j;  //minimum number of characters to be appended at the end of the string s 

    }
}
