class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n=nums.length;
      int left=0,right=nums[n-1];
      while(left<right){
        int mid=left+(right-left)/2;
        if(countValidPairs(nums,mid,n)>=p){
            right=mid;
        }else
        left=mid+1;
      }
      return left;
    }
    int countValidPairs(int[] nums,int mid,int n){
        int cnt=0;
        int i=0;
       while(i<n-1){
            if(Math.abs(nums[i]-nums[i+1])<=mid){
                cnt++;
                i++;
            }
            i++;
        }
        return cnt;
    }
}