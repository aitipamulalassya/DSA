class Solution {
    public String greatestLetter(String s) {
       char[] a=s.toCharArray();
       Arrays.sort(a);
       for(int i=s.length()-1;i>=0;i--){
        if(Character.isUpperCase(a[i])){
            if(s.contains(String.valueOf(Character.toLowerCase(a[i])))){
                return String.valueOf(a[i]);
            }
        }else if(Character.isLowerCase(a[i])){
 if(s.contains(String.valueOf(Character.toUpperCase(a[i])))){
                return String.valueOf(Character.toUpperCase(a[i]));
            }
        }
       }
       return "";
    }
}