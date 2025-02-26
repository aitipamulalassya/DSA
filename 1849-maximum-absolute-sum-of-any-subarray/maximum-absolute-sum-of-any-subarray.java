class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum=0,minSum=0;
        int ans=0;
        int n=nums.length;
       for(int i=0;i<n;i++){
        maxSum+=nums[i];
        minSum+=nums[i];
        ans=Math.max(ans,Math.max(maxSum,Math.abs(minSum)));
        if(maxSum<0){
           maxSum=0; 
        }
        if(minSum>0){
            minSum=0;
        }
       }
     return ans; 
    }
}