class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        int m=(int)Math.pow(2,n);
        int[] a=new int[m];

       
        for(int i=0;i<n;i++){
            int x=Integer.parseInt(nums[i], 2);
            a[x]=1;
        }
        int d=0;
        String t="";
        for(int i=0;i<m;i++){
            if(a[i]==0){
           t=Integer.toBinaryString(i);
            d=t.length();
              break;  
            }
        }
        int z=n-d;
        String str="";
        while(z!=0){
            str+="0";
            z--;
        }
        str+=t;
        return str;
    }
}