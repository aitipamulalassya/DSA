class Solution {
     List<List<Integer>> li=new ArrayList<>();
    public int subsetXORSum(int[] nums) {
       
        int i=0;
        int n=nums.length;
        int sum=0;
        List<Integer> temp=new ArrayList<>();
        helper(temp,nums,i,n);
        for(List<Integer> ss:li){
            int xor=0;
            for(int el:ss){
                xor^=el;
            }
            sum+=xor;
        }
        return sum;
    }
    void helper(List<Integer> temp,int[] nums,int i,int n){
        if(i==n)
        {
            li.add(new ArrayList<>(temp));
            return;
        }
       temp.add(nums[i]);
       helper(temp,nums,i+1,n);
       temp.remove(temp.size()-1);
        helper(temp,nums,i+1,n);

    }
}