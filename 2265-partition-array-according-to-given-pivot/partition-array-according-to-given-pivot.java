class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
       
List<Integer> li=new ArrayList<>();
List<Integer> li1=new ArrayList<>();
List<Integer> li2=new ArrayList<>();
      for(int i=0;i<n;i++){
        if(nums[i]<pivot){
            li.add(nums[i]);
        }else if(nums[i]>pivot){
            li1.add(nums[i]);
        }else
        li2.add(nums[i]);
      }
      int k=0;
      int i=0;
      while(i<li.size()){
        nums[k++]=li.get(i);
        i++;
      }
     i=0;
        while(i<li2.size()){
        nums[k++]=li2.get(i++);
      }
      i=0;
      
      while(i<li1.size()){
        nums[k++]=li1.get(i++);
      }
      return nums;
    }
}