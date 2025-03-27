class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for(int i : nums){
            map1.put(i, map1.getOrDefault(i, 0)+1);
        }
        int n = nums.size();
        for(int i = 0; i < n; i++){
            int x = nums.get(i);
            map2.put(x, map2.getOrDefault(x, 0)+1);
            int sfreq = map2.get(x);
            int efreq = map1.get(x)-sfreq;
            if(sfreq > (i+1)/2 && efreq > (n-i-1)/2)
                return i;
        }
        return -1;
    }
}