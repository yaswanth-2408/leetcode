class Solution {
    public int pivotIndex(int[] nums) {
       int tsum=0;
       int lsum=0;
       int rsum=0;
       for(int num:nums){
        tsum+=num;
       }
       for(int i=0;i<nums.length;i++){
        rsum=tsum-lsum-nums[i];
        if(lsum==rsum){
            return i;
        }
        lsum+=nums[i];
       }
       return -1;
    }
}