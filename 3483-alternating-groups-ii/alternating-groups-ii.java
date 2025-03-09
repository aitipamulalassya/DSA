class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int res=0;
        int[] extendcolor=new int[n+k-1];
        for(int i=0;i<n;i++){
            extendcolor[i]=colors[i];
        }
        for(int i=0;i<k-1;i++){
            extendcolor[n+i]=colors[i]; 
        }
        int left=0;
        int right=1;
        int m=extendcolor.length;
        while(right<m){
            if(extendcolor[right-1]==extendcolor[right]){
              left=right;
              right++;
                continue;
            }
            right++;
            if((right-left)<k){
                continue;
            }
            res++;
            left++;
        }
        return res;
    }
}