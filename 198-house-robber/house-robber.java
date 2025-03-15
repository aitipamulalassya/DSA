class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
      
      
         dp[0]=nums[0];
        
        
        for(int i=1;i<n;i++){
           int take=nums[i];
           if(i>1)
           take+=dp[i-2];
           int notake=dp[i-1];
           dp[i]=Math.max(take,notake);


        }
        return dp[n-1];
    }
}