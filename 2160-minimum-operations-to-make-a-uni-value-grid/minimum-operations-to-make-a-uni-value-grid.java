class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
       int[] ar=new int[n*m];
       int k=0;
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            ar[k++]=grid[i][j];
        }
       } 
       Arrays.sort(ar);
       int cnt=0;
       int mid=ar.length/2;
       for(int i=0;i<ar.length;i++){
        
        if(ar[i]>ar[mid]){
            if((ar[i]-ar[mid])%x!=0){
                return -1;
            }
            cnt+=(ar[i]-ar[mid])/x;
        }else{
            if((ar[mid]-ar[i])%x!=0){
                return -1;
            }
            cnt+=(ar[mid]-ar[i])/x;
        }
       }
       return cnt;
    }
}