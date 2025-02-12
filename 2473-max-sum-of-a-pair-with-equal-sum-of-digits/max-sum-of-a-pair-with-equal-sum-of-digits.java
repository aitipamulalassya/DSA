class Solution {
    public int maximumSum(int[] nums) {
        int[] digitSum=new int[100];
        int result=-1;
       for(int i=0;i<nums.length;i++){
            int digit_Sum=digitSum(nums[i]);
            if(digitSum[digit_Sum]>0){
                result=Math.max(result,nums[i]+digitSum[digit_Sum]);
            }
            digitSum[digit_Sum]=Math.max(nums[i],digitSum[digit_Sum]);
       } 
       return result;
    }
    static int digitSum(int n){
int sum=0;
while(n!=0){
    int d=n%10;
    sum+=d;
    n=n/10;
}
return sum;
    }
}