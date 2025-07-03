class Solution {
    public char kthCharacter(int k) {
        String str="a";
       
        for(int i=0;i<k;i++){
            
            String nstr="";
                for(int j=0;j<str.length();j++){
                    nstr+=(char)((int)(str.charAt(j))+1);
                }
            
            str+=nstr;
            if(str.length()>k){
                break;
            }
        }
       
        return str.charAt(k-1);
    }
}