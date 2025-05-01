class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
if(!st.isEmpty()&&st.peek()==s.charAt(i)){
    st.pop();
}else{
    st.push(s.charAt(i));
}

        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.toString();
        
    }
}