class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int mn=Integer.MAX_VALUE;
       for(int i=0;i<=n-k;i++){
        int wcnt=0;
         for(int j=i;j<i+k;j++){
            
        if(blocks.charAt(j)=='W'){
        wcnt++;
       }
        }
        System.out.println();
       
      
        mn=Math.min(mn,wcnt);
        }
        
       return mn;
    }
}