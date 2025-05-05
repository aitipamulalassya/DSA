class Solution {
    int cnt;
    public int findTargetSumWays(int[] nums, int target) {
        cnt=0;
        target(0,target,nums,0);
        return cnt;
    }
    void target(int cur,int tar,int nums[],int st){
        if(st==nums.length){
            if(cur==tar){
                cnt++;
            }
            return;
        }
        
            target(cur+nums[st],tar,nums,st+1);
            target(cur-nums[st],tar,nums,st+1);
        
    }
}