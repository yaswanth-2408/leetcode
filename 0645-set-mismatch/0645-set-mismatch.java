class Solution {
    public int[] findErrorNums(int[] nums) {
        int count[]=new int[nums.length+1];
        int dup=-1;
        int mis=-1;
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for(int i=1;i<count.length;i++){
            if(count[i]==2){
                dup=i;
            }
            else if(count[i]==0){
                
                mis=i;
            }
        }
        return new int[]{dup,mis};
    }
}