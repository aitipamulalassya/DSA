class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        for(int i=n-1;i>=0;i--){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
            }else{
                break;
            }
        }
        // System.out.println(st.size());
        int ans=n-st.size();
        
        return (int)Math.ceil(ans/3.0);
    }
}