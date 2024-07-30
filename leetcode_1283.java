// Binary Serach
// T.C: O( log(max(arr[])) * n)
// S.C: O(1)
class Solution {
    public int sumByDivisor(int nums[], int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += Math.ceil((double)(nums[i])/(double)(divisor));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        // if(n > threshold) return -1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi, nums[i]);
        }

        int low=1;
        int high=maxi;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(sumByDivisor(nums,mid) <= threshold){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
