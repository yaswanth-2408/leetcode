class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cur=0;
        int max_count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cur++;
                max_count=Math.max(max_count,cur);
            }
            else{
                cur=0;
            }
        }
         return max_count;
    }
}