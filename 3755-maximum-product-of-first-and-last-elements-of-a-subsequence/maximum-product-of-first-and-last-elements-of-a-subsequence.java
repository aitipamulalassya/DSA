class Solution {
    public long maximumProduct(int[] nums, int m) {
        int n=nums.length;
      
       long res=Long.MIN_VALUE;
       
       int[] smax=new int[n];
       int[] smin=new int[n];
if(m==1){
    for(int i=0;i<n;i++){
        res=Math.max(res,1L*nums[i]*nums[i]);
    }
    return res;
}
      smax[n-1]=nums[n-1];
      smin[n-1]=nums[n-1];
    for(int i=n-2;i>=0;i--){
        smax[i]=Math.max(nums[i],smax[i+1]);
        smin[i]=Math.min(nums[i],smin[i+1]);
    }
    for(int i=0;i+m-1<n;i++){
        res=Math.max(res,1L*nums[i]*smax[i+m-1]);
        res=Math.max(res,1L*nums[i]*smin[i+m-1]);
    }
        return res;
    }
}