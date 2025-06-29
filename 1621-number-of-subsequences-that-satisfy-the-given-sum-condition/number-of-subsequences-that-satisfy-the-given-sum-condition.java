class Solution {
    public int numSubseq(int[] nums, int target) {
        int n=nums.length;
        int ans=0;
        int MOD=1000000007;
        Arrays.sort(nums);
      
    int[] pow=new int[n];
      pow[0]=1;
    for(int i=1;i<n;i++){
        pow[i]=(pow[i-1]*2)%MOD;

    }
    int i=0,j=n-1;
while(i<=j){
if(nums[i]+nums[j]<=target){
    ans=(ans+pow[j-i])%MOD;
    i++;
}else
j--;
}
return ans;
    }
}