class Solution {
    public long countSubarrays(int[] nums, int k) {
       
        int n=nums.length;
int maxel=nums[0];
for(int i=1;i<n;i++){
    if(nums[i]>maxel){
        maxel=nums[i];
    }
}
        int r=0;
       int l=0;
        int cnt=0;
        long ans=0;
        for(r=0;r<n;r++){
            if(nums[r]==maxel){
                cnt++;
            }
           
            while(cnt>=k){
                
                
               ans+=n-r;
                
               if(nums[(int)l]==maxel)
               cnt--;
                l++;
            }
            
          
            
            
        }
        return ans;
    }
}