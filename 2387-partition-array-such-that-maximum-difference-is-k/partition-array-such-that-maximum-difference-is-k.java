class Solution {
    public int partitionArray(int[] nums, int k) {
      Arrays.sort(nums);
      int sm=nums[0];
      int cnt=1;
      int n=nums.length;
      for(int i=0;i<n;i++){
        if(nums[i]-sm>k){
         sm=nums[i];
         cnt++;
        }
      }  
      return cnt;
    }
}