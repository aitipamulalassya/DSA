class Solution {
    public int maximumCandies(int[] candies, long k) {
        int maxCand=0;
    long ans=0;
       for(int i=0;i<candies.length;i++){
        maxCand=Math.max(maxCand,candies[i]);
       } 
       long low=1,high=maxCand;
       while(low<=high){
        long mid=low+(high-low)/2;
        if(canAllocate(candies,k,mid)){
            ans=Math.max(ans,(int)mid);
            low=mid+1;
        }else{
            high=mid-1;
        }
       }
       return (int)ans;
    }
    boolean canAllocate(int[] arr,long k,long mid){
        long maxCand=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=mid){
maxCand+=arr[i]/mid;
            }
            
        }
        return maxCand>=k;
    }
}