class Solution {
    public int minOperations(int[] nums, int k) {
        if(nums.length<2)
        return 0;
      PriorityQueue<Long> pq=new PriorityQueue<>();
      for(int i=0;i<nums.length;i++){
        pq.add((long)nums[i]);
      } 
      int cnt=0;
     while(pq.peek()<k&&pq.size()>1){
        System.out.println(pq.peek());
        long x=pq.poll();
        long y=pq.poll();
        pq.add((Math.min(x, y) * 2) + Math.max(x, y));
        cnt++;
     }
      return cnt; 
    }
}