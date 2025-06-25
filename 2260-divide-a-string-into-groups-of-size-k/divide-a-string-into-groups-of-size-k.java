class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=s.length();
        int ind=0;
        String[] a=new String[(n%k==0)?n/k:n/k+1];
       for(int i=0;i<n;i+=k){
    int x=i;
    String nn="";
   
        for(int j=0;j<k;j++){
            if(x<n)
    nn+=s.charAt(x++);
    else{
        nn+=fill;
    }
        }
        a[ind]=nn;
        ind++;
       }
       return a;
       } 
    }
