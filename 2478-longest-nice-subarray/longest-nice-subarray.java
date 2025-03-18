class Solution {
    public int longestNiceSubarray(int[] nums) {
       int n=nums.length;
       long xor=0;
       int st=0;
       int mx=1;
       long sum=0;
       for(int end=0;end<n;end++){
                xor^=nums[end];
                sum+=nums[end];
                
                while(xor!=sum){
                    xor^=nums[st];
                    sum-=nums[st];
                    st++;
                }
                mx=Math.max(mx,end-st+1);

       }
       return mx; 
    }
}