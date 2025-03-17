class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int cnt=0;
        for(int el:mp.keySet()){
            int x=mp.get(el);
            if(x%2==0){
                cnt+=mp.get(el)/2;
            }else{
                return false;
            }
        }
        if(cnt==n/2)
        return true;
        return false;

       
    }
}