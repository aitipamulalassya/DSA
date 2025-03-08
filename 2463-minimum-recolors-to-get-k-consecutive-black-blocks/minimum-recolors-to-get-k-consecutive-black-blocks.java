class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
       
        int nw=0;
       for(int i=0;i<k;i++){
        if(blocks.charAt(i)=='W'){
            nw++;
        }
       }
       int mopr=nw;
       for(int i=k;i<n;i++){
        if(blocks.charAt(i)=='W')nw++;
        if(blocks.charAt(i-k)=='W')nw--;
        mopr=Math.min(mopr,nw);
       }
      
        
        
        
       return mopr;
    }
}