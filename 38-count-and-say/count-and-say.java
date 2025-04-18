class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        int i = 0, nn = s.length();
        while(i < nn){
            int count = 1;
            char ch = s.charAt(i);
            while(i < nn-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            i++;
            sb.append(Integer.toString(count)+ch);
        }
        return sb.toString();
    }
}