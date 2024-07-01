//T.C: O(n)
//S.C: O(1)
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count=0;
        for(int i=0; i<arr.length; i++){
            if( arr[i] % 2 != 0){ //odd
                count++;
            }else{ //even
                count=0;
            }
            if(count == 3){
                return true;
            }
        }
        return false;
    }
}
