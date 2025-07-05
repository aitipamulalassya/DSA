class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<arr.length;i++){
        mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
    }
    int max=-1;
    for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
        if(entry.getKey()==entry.getValue()){
           max=Math.max(max,entry.getKey());
        }

    }
    return max;
    }
}