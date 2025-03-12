class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
      int low=0;
      int high= n-1;
      int pos=n;
      int neg=n;
     while(low<=high){
        int mid=(low+(high-low)/2);
        if(nums[mid]>=0){
            neg=mid;
            high=mid-1;
        }else{
            
            low=mid+1;
        }

     }
     
low=0;
high=n-1;
     while(low<=high){
        int mid=(low+(high-low)/2);
        if(nums[mid]>0){
             pos=mid;
            high=mid-1;
        }else{
           
            low=mid+1;
        }

     }
     
    return Math.max(n-pos,neg);
    }
}