class Solution {
    public int numberOfSubstrings(String s) {
        int[] hash=new int[3];
        int ans=0;
      int n=s.length();
      int j=0;
        for(int i=0;i<n;i++){
            int ch=s.charAt(i);
            hash[ch-'a']++;
            while(hash[0]>0&&hash[1]>0&&hash[2]>0){
                ans+=n-i;
            char c=s.charAt(j);
             hash[c-'a']--;
             j++;

            }
        }
        return ans;
    }
}