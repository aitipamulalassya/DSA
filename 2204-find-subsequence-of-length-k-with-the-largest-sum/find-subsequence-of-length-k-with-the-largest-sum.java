class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans=new int[k];
        int n=nums.length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<n;i++){
            pq.add(new int[]{nums[i],i});
        }
        List<int[]> li=new ArrayList<>();
        while(k-->0){
li.add(pq.poll());
        }
        li.sort(Comparator.comparingInt(a->a[1]));
        for(int i=0;i<li.size();i++){
            ans[i]=li.get(i)[0];
        }
        return ans ;
    }
}