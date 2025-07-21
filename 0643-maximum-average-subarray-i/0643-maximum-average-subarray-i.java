class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double windosize=0;
        double maxsum=Double.NEGATIVE_INFINITY;
        for(int i=0;i<k;i++){
            windosize+=nums[i];
        }
        maxsum=windosize/k;
        for(int i=k;i<nums.length;i++){
            windosize+=nums[i]-nums[i-k];
            double cur=windosize/k;
            maxsum=Math.max(maxsum,cur);
        }
        return maxsum;
    }
}