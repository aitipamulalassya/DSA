class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> li=new ArrayList<>();
       String[] a={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
       if (digits == null || digits.length() == 0) {
            return li;
        }
       comb(digits,a,"",0,li);
       return li;
       
    }
    void comb(String digits,String[] a,String cur,int ind,List<String> li){
        if(ind==digits.length()){
            li.add(cur);
            return;
        }
        String ans=a[digits.charAt(ind)-'0'];
        for(char ch:ans.toCharArray()){
             comb(digits,a,cur+ch,ind+1,li);
        }
    }
}