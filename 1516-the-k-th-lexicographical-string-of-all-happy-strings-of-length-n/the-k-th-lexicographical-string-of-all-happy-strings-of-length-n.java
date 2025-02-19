class Solution {
    public String getHappyString(int n, int k) {
       List<String> ans=new ArrayList<>();
       generateHappyStrings(n,"",ans);
       if(ans.size()<k)return "";
       Collections.sort(ans);
       return ans.get(k-1);
    }
    static void generateHappyStrings(int n,String current,List<String> ans){
        if(current.length()==n){
            ans.add(current);
            return;
        }
        for(char i='a';i<='c';i++){
            if(current.length()>0&&current.charAt(current.length()-1)==i){
                continue;
            }
            generateHappyStrings(n,current+i,ans);
        }
    }

}