class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i=i+3){
            
                if(nums[i+2]-nums[i]>k){
                    return new int[0][0];
                }
            
        }
        int[][] a=new int[n/3][3];
        int x=0;
        int i=0;
        while(i<n){
            
            for(int j=0;j<3;j++){
                a[x][j]=nums[i++];
              

            }
            x++;
            
        }
        return a;
    }
}