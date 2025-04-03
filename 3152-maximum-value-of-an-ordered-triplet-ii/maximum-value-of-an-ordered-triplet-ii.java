class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],nums[i-1]);
            rightmax[n-1-i]=Math.max(rightmax[n-i],nums[n-i]);
        }
        long ans=0;
        for(int i=1;i<n-1;i++){
            ans=Math.max(ans,(long)(leftmax[i] - nums[i]) * rightmax[i]);
        }
        return ans;
    }
}