class Solution {
    public int[] sumZero(int n) {
        int[]arr=new int[n];
        int index=0;
        if(n%2!=0){
            arr[index++]=0;
        }
        for(int i=1;index<n;i++){
            arr[index++]=i;
            arr[index++]=-i;
        }
        return arr;
    }
}