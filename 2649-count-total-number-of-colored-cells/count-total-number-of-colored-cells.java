class Solution {
   
    public long coloredCells(int n) {
   long ans=1;
   long addcolor=4;
   while(n-->1){
    ans+=addcolor;
    addcolor+=4;
   }
   return ans;
    }
}