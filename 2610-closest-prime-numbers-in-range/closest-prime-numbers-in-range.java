class Solution {
    boolean flag=true;
 static  List<Integer> primelist=new ArrayList<>();
  static{
         seive(1000000); 

         }
    public int[] closestPrimes(int left, int right) {
   
        int[] ans=new int[]{-1,-1};
       List<Integer> li=new ArrayList<>(); 
       for(int i=0;i<primelist.size();i++){
        if(primelist.get(i)>=left&&primelist.get(i)<=right){
            li.add(primelist.get(i));
          
        }
       }

       int mn=Integer.MAX_VALUE;
       for(int i=1;i<li.size();i++){
        if((li.get(i)-li.get(i-1))<mn){
            ans[0]=li.get(i-1);
            ans[1]=li.get(i);
            mn=li.get(i)-li.get(i-1);
        }
       }
       return ans;

    }
    public static void seive(int n){
      
        boolean[] isprime=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;isprime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(isprime[i]){
  for(int j=i*i;j<=n;j+=i){
    isprime[j]=false;
  }
  
            }
          
        }
        for(int i=2;i<=n;i++){
    if(isprime[i])
    primelist.add(i);
  }
        return;
    }
}