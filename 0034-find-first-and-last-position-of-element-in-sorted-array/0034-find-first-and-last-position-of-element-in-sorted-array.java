class Solution {
    public int[] searchRange(int[] nums, int target) {
       int[]res={-1,-1};
       if(nums.length==0 ||nums==null){
        return res;
       }
       res[0]=first(nums,target);
       res[1]=sec(nums,target);
       return res; 
    }
     public static int first(int[]nums,int target){
        int fir=0;
        int last=nums.length-1;
        int index=-1;
        while(fir<=last){
            int mid=(fir+last)/2;
            if(nums[mid]==target){
                index=mid;
                last=mid-1;
            }
            else if(nums[mid]<target){
                fir=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return index;
    }
       public static int sec(int[]nums,int target){
        int fir=0;
        int last=nums.length-1;
        int index=-1;
        while(fir<=last){
            int mid=(fir+last)/2;
            if(nums[mid]==target){
                index=mid;
                fir=mid+1;
            }
            else if(nums[mid]<target){
                fir=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return index;
    }
}