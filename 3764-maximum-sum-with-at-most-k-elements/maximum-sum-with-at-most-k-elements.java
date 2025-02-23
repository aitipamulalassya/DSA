class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int index=0;
        long maxSum=0;
        int totlimits=0;
        for(int i=0;i<limits.length;i++){
           totlimits+=limits[i];
        }
        int[] ans_sum=new int[ totlimits];
      for(int i=0;i<grid.length;i++){
          int[] a=new int[grid[i].length];
        for(int j=0;j<grid[i].length;j++){
            a[j]=grid[i][j];
           
        }
          
      Arrays.sort(a);

          
          int ithlimit=limits[i];
          int ind=a.length-1;
         
          while(ithlimit>0&&ind>=0){
              ans_sum[index++]=a[ind--];
              
              ithlimit--;
          }
          
      } 
        
        Arrays.sort(ans_sum);
        int ans_sumind=ans_sum.length-1;
        while(k>0){
            maxSum+=ans_sum[ans_sumind];
            ans_sumind--;
            k--;
        }
        return maxSum;
    }
}