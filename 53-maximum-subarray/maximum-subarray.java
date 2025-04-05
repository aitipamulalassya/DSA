class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int ans=Integer.MIN_VALUE;
        int n=nums.length;
        for(int end=0;end<n;end++){
            sum+=nums[end];
            if(sum>ans){
                ans=sum;
            }
            if(sum<0){
                sum=0;
            }
            
        }
        return ans;
    }
}