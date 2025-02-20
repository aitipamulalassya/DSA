class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        int m=(int)Math.pow(2,n);
        int[] a=new int[m];

       
        for(int i=0;i<n;i++){
            int decimal=Integer.parseInt(nums[i], 2);
            a[decimal]=1;
        }
        int index=0;
        String ans="";
        for(int i=0;i<m;i++){
            if(a[i]==0){
           ans=Integer.toBinaryString(i);
            index=ans.length();
              break;  
            }
        }
        int r=n-index;
        String str="";
        while(r!=0){
            str+="0";
            r--;
        }
        str+=ans;
        return str;
    }
}