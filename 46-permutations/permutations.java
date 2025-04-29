class Solution {
    List<List<Integer>> oli;
    public List<List<Integer>> permute(int[] nums) {
        oli=new ArrayList<>();
        int n=nums.length;
        List<Integer> li=new ArrayList<>();
        boolean vis[]=new boolean[n];
        int i=0;
        permutation(nums,i,n,li,vis);
        return oli;
    }
    void permutation(int[] nums,int i,int n,List<Integer> li,boolean[] vis){
        if(li.size()==n){
            oli.add(new ArrayList<>(li));
            return;
        }
        for(int j=0;j<n;j++){
            if(!vis[j]){
                li.add(nums[j]);
                vis[j]=true;
permutation(nums,i,n,li,vis);
li.remove(li.size()-1);
vis[j]=false;
            }
        }
    }
}