class Solution {
    public int longestStrChain(String[] words) {
       Arrays.sort(words,(w1,w2)->{
        return w1.length()-w2.length();
       });
       int res=0;
       Map<String,Integer> mp=new HashMap<>();
       for(String word:words){
        int best=0;
            for(int i=0;i<word.length();i++){
                String temp=word.substring(0,i)+word.substring(i+1);
                best=Math.max(best,mp.getOrDefault(temp,0)+1);
            }
            mp.put(word,best);
            res=Math.max(res,best);
       } 
       return res;
    }
}