class Solution {
    public int maxDifference(String s) {
        int[] ar=new int[26];
        for(char ch:s.toCharArray()){
            ar[ch-'a']++;
        }
       int odd=0;
       int even=Integer.MAX_VALUE;
       for(int i=0;i<26;i++){
        if(ar[i]!=0){
            if(ar[i]%2!=0&&ar[i]>odd){
                odd=ar[i];
            }
            if(ar[i]%2==0&&ar[i]<even){
                even=ar[i];
            }
        }
       }
       return odd-even;
        }
    
}