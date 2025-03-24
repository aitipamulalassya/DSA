class Solution {
    public int countDays(int days, int[][] meetings) {
        
          Arrays.sort(meetings, Comparator.comparingInt(row -> row[0]));
        int cnt=0;
 int last=0;
   
 
        for(int i=0;i<meetings.length;i++){
           if(meetings[i][0]>(last+1)){
           
            cnt+=(meetings[i][0]-last-1);
           
           }
            last=Math.max(last,meetings[i][1]);

        }
        cnt+=days-last;
        return cnt;
    }
}