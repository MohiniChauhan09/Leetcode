// T.C: O(log(max(piles[])) * O(n))
// S.C: O(1)
// Binary Search
class Solution {
    public int findMax(int[] v){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++){
            max=Math.max(max,v[i]);
        }
        return max;
    }
    public int findTotalHours(int v[], int h, int hourly){
        int totalHours=0;
        for(int i=0;i<v.length;i++){
            totalHours+=Math.ceil((double)(v[i]) / (double)(hourly));
        }
        return totalHours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=findMax(piles);
         int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            int totalHours=findTotalHours(piles,h,mid);
            if(totalHours <= h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
