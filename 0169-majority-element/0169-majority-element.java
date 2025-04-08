class Solution {
    public int majorityElement(int[] nums) {
        int can=0;
        int con=0;
        for(int i=0;i<nums.length;i++){
            if(con==0){
                can=nums[i];
            }
            if(can==nums[i]){
                con++;
            }
            else{
                con--;
            }
        }
        return can;
    }
}