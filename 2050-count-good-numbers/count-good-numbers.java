class Solution {
   int mod=1000000007;
    public int countGoodNumbers(long n) {
    long odd=n/2;
    long even=n/2+n%2;
    return (int)(power(5,even)*power(4,odd)%mod);    
    }
    long power(int x,long y){
        if(y==0)return 1;
        if(y==1)return x;
        long ans=power(x,y/2);
        ans*=ans;
        ans%=mod;
        if(y%2==1)ans*=x;
        ans%=mod;
        return ans;
    }
}