class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
       long cnt=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
        int low=lowerbound(nums,i+1,n-1,lower-nums[i]);
        int high=upperbound(nums,i+1,n-1,upper-nums[i]);
        
        cnt+=high-low+1;
       }
        return cnt;
    }
    int lowerbound(int[] nums,int l,int h,int target){
       
        int ans=h+1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>=target){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    } 
    int upperbound(int[] nums,int l,int h,int target){
       
        int ans=l-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]<=target){
                ans=mid;
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }

}