class Pair{
    int x,y;
    public Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n=nums1.length,m=nums2.length;
        int i=0,j=0;
       List<Pair> li=new ArrayList<>();
      
       while(i<n&&j<m){
    
        if(nums1[i][0]==nums2[j][0]){
           li.add(new Pair(nums1[i][0],nums1[i][1]+nums2[j][1]));
          
    i++;
    j++;
    
        }else if(nums1[i][0]<nums2[j][0]) {
           li.add(new Pair(nums1[i][0],nums1[i][1]));
           
            i++;

        }else{
           li.add(new Pair(nums2[j][0],nums2[j][1]));
           
            j++;
           
        }
      
       }
       while(i<n){
  li.add(new Pair(nums1[i][0],nums1[i][1]));
            i++;
           
       }
          while(j<m){
 li.add(new Pair(nums2[j][0],nums2[j][1]));
            j++;
          
       }
       int[][] a=new int[li.size()][2];
       for(i=0;i<a.length;i++){
        Pair e=li.get(i);
            a[i][0]=e.x;
            a[i][1]=e.y;
       }
       return a;

    }
}