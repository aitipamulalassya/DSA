class Solution {
    public String reverseOnlyLetters(String s) {
    StringBuilder str=new StringBuilder();
      for(int i=0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i))){
            str.append(s.charAt(i));
        }

      }
      str.reverse();
      int j=0;
     StringBuilder res=new StringBuilder();
       for(int i=0;i<s.length();i++){
        if(Character.isLetter(s.charAt(i))){
           
          res.append(str.charAt(j)); 
    j++;
         
        }else{
            res.append(s.charAt(i));
        }
       
        

      }
    return res.toString();
        
    }
}