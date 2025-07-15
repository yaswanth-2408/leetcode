class Solution {
    public int maxSubArray(int[] nums) {
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int temp=nums[i]+cursum;
            if(temp<nums[i]){
                cursum=nums[i];
            }
            else{
                cursum=temp;
            }
            if(cursum>maxsum){
                maxsum=cursum;
            }
        }
        return maxsum;
    }
}