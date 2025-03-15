class Solution {
    public int minCapability(int[] nums, int k) {
        int n=nums.length;
        int maxEle=0;
       for(int i=0;i<n;i++){
        maxEle=Math.max(maxEle,nums[i]);
       } 
       int low=1,high=maxEle;
       while(low<high){
            int mid=low+(high-low)/2;
            if(canAllocate(nums,k,mid)){
                high=mid;
            }else
           low=mid+1;
       }
       return low;
    }
    boolean canAllocate(int[] nums,int k,int mid){
        int minCap=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                minCap++;
                i++;
            }
        }
        return minCap>=k;
    }
}