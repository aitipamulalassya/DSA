class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        
      for(int i=0;i<n-1;i++){
        if(nums[i]==nums[i+1]){
            nums[i]*=2;
            nums[i+1]=0;
        }
      }
      int j=0;
      int i=0;
      for(i=0;i<n;i++){
        if(nums[i]==0){
            j=i;
            break;
        }
      } 
      if(i==n)
      return nums;
      for(i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
      } 
      return nums;
    }
}