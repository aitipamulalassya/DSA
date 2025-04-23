class Solution {
    public int countLargestGroup(int n) {
        int[] a=new int[37];
        int ans=0;
        for(int i=1;i<=n;i++){
            int sum=0;
            int temp=i;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
    a[sum]+=1;
    if(ans<a[sum])
    ans=a[sum];
        }
        int cnt=0;
        for(int i=0;i<37;i++){
            if(ans==a[i])
            cnt++;
        }
        return cnt;
        
       

    }
}