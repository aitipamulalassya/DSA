class Solution {
    public String clearStars(String s) {
        int n=s.length();
        PriorityQueue<Character> pq=new PriorityQueue<>();
        Map<Character,Deque<Integer>> mp=new HashMap<>();
boolean[] arr=new boolean[n];
Arrays.fill(arr,true);
       for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='*'){
char sm=pq.poll();

int indx=mp.get(sm).removeLast();
arr[indx]=false;
arr[i]=false;
        }else{
            pq.offer(ch);
            mp.putIfAbsent(ch,new ArrayDeque<>());
            mp.get(ch).add(i);
            
            
        }
       }
       String res="";
       for(int i=0;i<n;i++){
        if(arr[i]){
            res+=s.charAt(i);
        }
       } 
       return res;
    }
}