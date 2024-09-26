//Approach : Brute Force 
//T.C : O(n^2)
//S.C : O(n)
class MyCalendar {
    List<int[]> ans;
    public MyCalendar() {
        ans= new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int[] a : ans){
            if( !(a[0] >= end || a[1] <= start) ) return false;
        }
        ans.add(new int[]{start,end});
        return true;
    }
}
