class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int[] a=new int[(n*n)+1];
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               int val=grid[i][j];
               System.out.println(val);
               if(a[val]==0){
                a[val]=1;
               }else{
                ans[0]=val;
                
               }
            }
            
        }
        for(int i=1;i<=n*n;i++){
            if(a[i]==0){
                ans[1]=i;
                break;
            }
        }
        return ans;
    }
}