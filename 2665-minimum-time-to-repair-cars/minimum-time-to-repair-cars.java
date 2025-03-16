class Solution {
    public long repairCars(int[] ranks, int cars) {
        int minrank=101;
        
        for(int i=0;i<ranks.length;i++){
            minrank=Math.min(minrank,ranks[i]);       }
            long low=1,high=(long)minrank*cars*cars;
            long minTime=0;
            while(low<=high){
                long mid=low+(high-low)/2;
                if(canPossible(ranks,cars,mid)){
                    minTime=mid;
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            return minTime;
    }
    boolean canPossible(int[] ranks,int cars,long mid){
        long totCars=0;
        for(int i=0;i<ranks.length;i++){
            totCars+=(long)Math.sqrt(mid/ranks[i]);
            
        }
     return (totCars>=cars);
     
    }
}