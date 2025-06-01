class Solution {
    public long distributeCandies(int n, int limit) {
       long cnt=0;
    for(int i=0;i<=Math.min(n,limit);i++){
       
            if(n-i<=2*limit){
                cnt+=Math.min(n-i,limit)-Math.max(0,n-i-limit)+1;
            }
        
    } 
    return cnt;
    }
}