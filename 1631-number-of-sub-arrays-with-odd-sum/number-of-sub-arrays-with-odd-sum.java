class Solution {
    public int numOfSubarrays(int[] arr) {
    int mod=1000000007;
    int cnt=0,preSum=0;
    int oddCnt=0,evenCnt=1;
    for(int e:arr){
        preSum+=e;
        if(preSum%2==0){
            cnt+=oddCnt;
            evenCnt++;
        }else{
            cnt+=evenCnt;
            oddCnt++;
        }
        cnt%=mod;
    }  
    return cnt;  
    }
}